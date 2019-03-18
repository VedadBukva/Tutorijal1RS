package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {

    @FXML
    private Label labela;

    public void akcija(ActionEvent event) {
        labela.setText("Hello World");
    }
}
