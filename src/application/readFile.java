/* *********************************************************
 * readFile - класс осуществляющий чтение файла и запись данных
 * из него в буфер для последующей обработки.
 * *********************************************************
 * Используемые методы:
 * Read_file() - метод разбития битового потока на байты.
 * inClass - метод класса processingMethod.
 * */
package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Vector;
import javafx.collections.ObservableList;

public class readFile {
	/*Read_file() - метод разбития битового потока на байты.
	 * ******************************************************
	 * Используемые переменные:
	 * buff - буфер;
	 * c - счетчик байта;
	 * stringByte - строка байта;
	 * array_par - массив параметров в 8-битном представлении.
	 *  Используемый метод:
	 *  inClass - метод класса processingMethod.
	 * */
	public  ObservableList<parameters> Read_file() {
												// Буфер для хранения параметров
											 	// в 8-битном представлении.
		Vector<String> buff=new Vector<String>();		
		try(FileInputStream fin=new FileInputStream("C://Users//Вячеслав//OneDrive//Рабочий стол//package.txt"))
        {   byte[] buffer = new byte[fin.available()];
        String stringByte="";
        Integer c=0;
        fin.read(buffer, 0, fin.available()); 
         
        										// Цикл записи значений в буфер
         for(int j=0; j<buffer.length;j++){
        	 c++;
        	 stringByte=stringByte+(char)buffer[j];
        	 if (c%8==0) {
        		 buff.add(stringByte);
        		 stringByte="";
        	 }
        	 
         }
         
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        } 
        
	    Integer[] array_par = new Integer[buff.size()];
	    for(int i=0; i<buff.size();i++){
			array_par[i]=Integer.parseInt(buff.get(i),2);
        }
	    										// Вызов метода inClass
	    processingMethod startProc = new processingMethod();
	    return(startProc.inClass(array_par));
	}

}
