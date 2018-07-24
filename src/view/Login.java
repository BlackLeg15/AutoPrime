package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * *@author Liliane
 * @version 1.0
 *
 */
public class Login extends Application {
	public static void main(String[] args) {
		launch(args);
		
	}//fim do metodo main
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("FXMLDocuments.fxml"));
		
	}//fim do metodo start
	
}//fim da classe 
