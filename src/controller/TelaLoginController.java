package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Caminho;
import model.ChangeScreen;
import model.Especificacoes;
import model.Usuario;

//Modelo para TelaLoginController
public class TelaLoginController {
	
    @FXML
    private TextField campoLogin;
    @FXML
    private PasswordField campoSenha;
   
    @FXML
    private Label mensagemErro;
        
    @FXML
    void cliqueBotaoEntrar(ActionEvent event) throws Exception {

    	  if (Usuario.login(campoLogin.getText().trim(), campoSenha.getText().trim())){
    		 ChangeScreen change = new ChangeScreen();

             Stage mainStage = change.change(event, Caminho.telaGerente, Especificacoes.getSoftwareNome(), true);
             mainStage.show();
         }
	     else {
	         mensagemErro.setVisible(true);
	         mensagemErro.setText("Login e/ou senha inv�lido(s)");
	     }
    }
    
}