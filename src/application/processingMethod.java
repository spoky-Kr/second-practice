/* *************************************************************************
 * processingMethod - класс обработки массива чисел в 8-битном представлении.
 * *************************************************************************
 * Используемые переменные:
 * numPackage - номер пакета;
 * numSystem - номер системы;
 * shot - количество кадров;
 * countByte - количество байт в кадре;
 * time - время;
 * coordinates - координаты;
 * amperage - сила тока;
 * temp - температура;
 * res - переменная типа ObservableList.
 * */
package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class processingMethod {
	public  ObservableList<parameters> inClass(Integer[] array_par) {
		ObservableList<parameters> res=FXCollections.observableArrayList();
		Integer numPackage, numSystem, shot, countByte=13;
		String time="", coordinates="", amperage, temp="";
		shot=array_par.length/countByte;					// Вычисление количества кадров
		countByte=0;
		for(int i=0; i<shot;i++) {							// Цикл обработки кадров
			numPackage = array_par[0+countByte];
			numSystem = array_par[1+countByte];
			for(int j=2+countByte; j<6+countByte; j++) {	// Цикл обработки времени
				time=time+":"+array_par[j].toString();
			}
		
			for(int j=6+countByte; j<10+countByte; j++) {	// Цикл обработки координат
				coordinates=coordinates+"."+array_par[j].toString();
			}
			amperage=array_par[10+countByte].toString();
		
			for(int j=11+countByte; j<=12+countByte; j++) {	// Цикл обработки температуры
				temp=temp+"."+array_par[j].toString();
			}
			res.add(new parameters( numPackage,  numSystem,  time.substring(1),  coordinates.substring(1),  amperage, temp.substring(1)));
			countByte=countByte+13;							// Сдвиг указателя и
			time="";										// обнуление переменных
			coordinates="";
			temp="";
		}													// Возврат обработанных 
	return res;												// значений
	}

}
