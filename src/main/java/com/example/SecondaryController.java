package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController {

    @FXML
    private Button secondaryButton1;
    @FXML
    private Button secondaryButton;

    //Switch back to primary/order pizza or order drink
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}