package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Caminho;
import model.Especificacoes;

public class MainController extends Application {
	
    @Override
    public void start (Stage primaryStage) throws Exception{
    	
        //Esta classe chama a construção da primeira interface do software Scout, que desencadeia nas outras chamada de interfaces utilizando a tecnologia JavaFx
        Parent root = FXMLLoader.load(getClass().getResource(Caminho.telaLogin));

        Scene scene = new Scene(root);

        primaryStage.setTitle(Especificacoes.getSoftwareNome());
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main (String[] args){
        launch(args);
    }
}