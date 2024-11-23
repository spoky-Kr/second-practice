/************************************************************
 * parameters - класс параметров.
 * **********************************************************
 * Используемые переменные:
 * numPackage - номер пакета;
 * numSystem - номер системы;
 * time - время;
 * coordinates - координаты;
 * amperage - сила тока
 * temp - температура.
 * ***********************************************************
 * Используемые методы:
 * getNumPackage - функция возвращающая номер пакета;
 * setNumPackage - процедура записи номера пакета;
 * getNumSystem - функция возвращающая номер системы;
 * setNumSystem - процедура записи номера системы;
 * getTime - функция возвращающая время;
 * setTime - процедура записи времени;
 * getCoordinates - функция возвращающая координаты;
 * setCoordinates - процедура записи координат;
 * getAmperage - функция возвращающая силу тока;
 * setAmperage - процедура записи силы тока;
 * getTemp - функция возвращающая температуру в системе;
 * setTemp - процедура записи температуры.
 * *************************************************************/
package application;

public class parameters {
	Integer numPackage, numSystem;
	String time, coordinates, amperage, temp;
	public Integer getNumPackage() {
		return numPackage;
	}
	public void setNumPackage(Integer numPackage) {
		this.numPackage = numPackage;
	}
	public Integer getNumSystem() {
		return numSystem;
	}
	public void setNumSystem(Integer numSystem) {
		this.numSystem = numSystem;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	public String getAmperage() {
		return amperage;
	}
	public void setAmperage(String amperage) {
		this.amperage = amperage;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	/*parameters - конструктор класса parameters.
	 * */
	public parameters(Integer numPackage, Integer numSystem, String time, String coordinates, String amperage,
			String temp) {
		super();
		this.numPackage = numPackage;
		this.numSystem = numSystem;
		this.time = time;
		this.coordinates = coordinates;
		this.amperage = amperage;
		this.temp = temp;
	}
	
	
}
