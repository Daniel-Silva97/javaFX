package com.example.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
    @FXML
    private Button btnTest;

    @FXML
    public void onBtnTestAction(){
        System.out.println("Click");
    }
}
