package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary.fxml");
    }

    @FXML
    private void switchToDrink() throws IOException {
        App.setRoot("Drink.fxml");
    }
}
