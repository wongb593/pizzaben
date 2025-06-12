package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button OrderPizza;
    @FXML
    private Button OrderDrink;

    //switch to order preset or custom pizza page
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary.fxml");
    }

    //switch to order drink
    @FXML
    private void switchToDrink() throws IOException {
        App.setRoot("Drink.fxml");
    }
}
