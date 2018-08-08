package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TelaGerenteController {

    @FXML
    private Button insereFunc;

    @FXML
    private Button editaFunc;

    @FXML
    private Button removeFunc;

    @FXML
    private Button gerarRelatorio;

    @FXML
    private TextField campoPesquisa;

    @FXML
    private TableView<?> listaClientes;

    @FXML
    private TableColumn<?, ?> colunaNome;

    @FXML
    private TableColumn<?, ?> colunaCPF;

    @FXML
    void editaFunc(ActionEvent event) {

    }

    @FXML
    void geraRelatorio(ActionEvent event) {

    }

    @FXML
    void insereFunc(ActionEvent event) {

    }

    @FXML
    void removeFunc(ActionEvent event) {

    }

}
