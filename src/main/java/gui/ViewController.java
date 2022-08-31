package gui;

import gui.utils.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {
    @FXML
    private Button btnTest;

    @FXML
    public void onBtnTestAction(){
        Alerts.showAlert("Alert title", null, "Hello", Alert.AlertType.INFORMATION);
    }
}
