/*************************************************************
 * SampleController - класс формы с отображением обработанных 
 * данных.
 * **********************************************************
 * Используемые методы:
 * on_Button_binaryText - обработчик события нажатия на кнопку исходного
 * кода пакетов;
 * on_Button_hideParameters - обработчик события нажатия на кнопку скрытия
 * параметров;
 * on_Button_showParameters - обработчик события нажатия на кнопку показа
 * параметров;
 * initialize - инициализация данных в таблице на форме.
 * ***********************************************************
 * */

package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

public class SampleController {
												// Объявление графических элементов формы
	@FXML										// Объявление объекта TableView
	private TableView<parameters> tableView_main;
	@FXML										// Объявление колонки номера пакета
	private TableColumn<parameters,Integer> col_numPackage;
	@FXML										// Объявление колонки номера системы
	private TableColumn<parameters,Integer> col_numSystem;
	@FXML										// Объявление колонки времени
	private TableColumn<parameters,String> col_time;
	@FXML										// Объявление колонки координат
	private TableColumn<parameters,String> col_coordinates;
	@FXML										// Объявление колонки силы тока
	private TableColumn<parameters,String> col_amperage;
	@FXML										// Объявление колонки температуры
	private TableColumn<parameters,String> col_temp;
	@FXML
	private Button Button_showParameters;
	@FXML
	private Button Button_hideParameters;
	@FXML
	private Button Button_binaryText;
    
	/*
     * on_Button_binaryText - обработчик события нажатия на кнопку исходного
     * кода пакетов. Выполняет открытие формы с исходным кодом пакетов.
     * */
	@FXML
    void on_Button_binaryText(ActionEvent event) {
	    FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(getClass().getResource("/application/inputData.fxml"));
	    try {
		    loader.load();
	    } catch (IOException e) {
		    e.printStackTrace();
	    }
	    Parent root = loader.getRoot();
	    Stage stage = new Stage();
	    stage.setScene(new Scene(root,600,500));
	    stage.show();
    }
	 /*
	  * on_Button_hideParameters - обработчик события нажатия на кнопку скрытия
	  * параметров. Скрывает все параметры в таблице.
	  * */
    @FXML
    void on_Button_hideParameters(ActionEvent event) {
    	tableView_main.getItems().clear();
    }
	 
	 /* on_Button_showParameters - обработчик события нажатия на кнопку показа
	  * параметров. Отображает данные в таблице.
	  * */
    @FXML
    void on_Button_showParameters(ActionEvent event) {
    	readFile reading = new readFile();
    	tableView_main.setItems(reading.Read_file());
    }
	/* initialize - инициализация данных в таблице на форме.
	 * Производится назначение колонкам типов данных и их последующее заполнение
	 * путем обращения к классу readFile.
	 * Используемые методы:
	 * Read_file - метод класса readFile, обеспечивающий чтение файла с данными.
	 * */
    @FXML
    void initialize() { 	
    	col_numPackage.setCellValueFactory(new PropertyValueFactory<>("numPackage")); 
    	col_numSystem.setCellValueFactory(new PropertyValueFactory<>("numSystem")); 
    	col_time.setCellValueFactory(new PropertyValueFactory<>("time")); 
    	col_coordinates.setCellValueFactory(new PropertyValueFactory<>("coordinates")); 
    	col_amperage.setCellValueFactory(new PropertyValueFactory<>("amperage")); 
    	col_temp.setCellValueFactory(new PropertyValueFactory<>("temp")); 	
    	readFile reading = new readFile();
    	tableView_main.setItems(reading.Read_file());
    }
}
