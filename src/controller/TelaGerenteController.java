package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.ChangeScreen;
import model.Caminho;
import model.ChangeScreen;
import model.Especificacoes;

public class TelaGerenteController {

	@FXML
	private Button insereFunc;

	@FXML
	private Button editaFunc;
	
	@FXML
	void insereFunc(ActionEvent event) throws Exception {
		ChangeScreen change = new ChangeScreen();

		Stage ofertasStage = change.change(event, Caminho.telaCadFunc, null, true);
		ofertasStage.show();
	}

	@FXML
	void editaFunc(ActionEvent event) throws Exception {
		ChangeScreen change = new ChangeScreen();

		Stage ofertasStage = change.change(event, Caminho.telaRelatorios, null, true);
		ofertasStage.show();
	}

	@FXML
	void initialize() {
		/*if (ArrayLists.tobArray.isEmpty())
			botaoInsereCli.setDisable(true);
		else
			botaoInsereCli.setDisable(false);
		if (ArrayLists.alunoArray.isEmpty() && ArrayLists.alunoAptoArray.isEmpty())
			botaoEditaCli.setDisable(true);
		else
			botaoEditaCli.setDisable(false);*/
	}
}
