/*
 *Производственная практика по ПМ.01 Разработка программных 
 *модулей программного обеспечения для компьютерных систем 
 *************************************************************
 * Название: Telemetry.
 * Разработал: Крапивкин Вячеслав Анатольевич
 * Группа: ТМП-81.
 * Специальность: 09.02.03.
 * Дата и номер версии: 20.02.2023 v1.1.
 * Язык программирования: Java.
 * Среда разработки: Eclipse 2022-09.
 ***************************************************************
 * Задание:
 * Реализовать часть программного обеспечения, отвечающую обработку 
 * и отображение информации принятой со спутника.
 * Необходимо разработать и реализовать алгоритм чтения бинарных 
 * файлов, содержащих показания датчиков в двоичном компанованном виде.
 * А также реализовать простой интерфейс для просмотра 
 * обработанной информации.
 * ***************************************************************
 * Функциональным назначением разрабатываемых программных модулей является:
 * - чтение и дешифровка бинарного файла;
 * - обработка принятых параметров;
 * - отображение параметров в таблице в окне разработчика.
 * ***************************************************************
 * Используемые классы:
 * SampleController - класс формы с обработанными параметрами;
 * inputDataController - класс формы с исходным файлом;
 * parameters - класс параметров;
 * processingMethod - класс обработки;
 * readFile - класс чтения данных из файла.
 * *****************************************************************/
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {       // Процедура открытия главной формы
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,700,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
