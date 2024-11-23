/* **********************************************************
 * inputDataController - класс формы с исходным кодом.
 * **********************************************************
 * Используемые методы:
 * initialize - метод инициализации формы.
 * */

package application;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.fxml.FXML;

import javafx.scene.control.TextArea;


public class inputDataController {
	@FXML
	private TextArea main_textArea;
 
	/* initialize - метод инициализации формы.
	 * Производит вывод исходного кода на форму.
	 ************************************************
	 * Используемые переменные:
	 * stringByte - строка байта;
	 * c - счетчик бит;
	 * */
    @FXML
    void initialize() { 	
    	main_textArea.setWrapText(true);
    	try(FileInputStream fin=new FileInputStream("C://Users//Вячеслав//OneDrive//Рабочий стол//package.txt"))
        {   byte[] buffer = new byte[fin.available()];
        String stringByte="";
        Integer c=0;
        fin.read(buffer, 0, fin.available()); 
         												// Цикл вывода бинарного потока
         for(int j=0; j<buffer.length;j++){				// по кадрам
        	 c++;
        	 stringByte=stringByte+(char)buffer[j];
        	 if (c==104) {
        		 main_textArea.appendText(stringByte);
        		 System.out.println(stringByte);
        		 c=0;
        		 stringByte="";
        	 }
        	 
         }
         
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        } 
    }
}
