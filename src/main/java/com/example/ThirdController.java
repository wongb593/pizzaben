
package com.example;

import javafx.fxml.FXML;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class ThirdController {

    // Switch to Confirmation page
    @FXML
    private void switchToFourth() throws IOException {
        App.setRoot("fourth");
    }

    @FXML
    private CheckBox pepperoni;
    @FXML
    private CheckBox ham;
    @FXML
    private CheckBox sausage;
    @FXML
    private CheckBox chicken;
    @FXML
    private CheckBox greenpepper;
    @FXML
    private CheckBox mushroom;
    @FXML
    private CheckBox blackolive;
    @FXML
    private CheckBox onion;
    @FXML
    private CheckBox spinach;
    @FXML
    private Label lblitems; 
    @FXML
    private Label lblnoitems;

    @FXML
    public void checkEvent(ActionEvent event) {
        int count = 0;
        StringBuilder items = new StringBuilder();

        if (pepperoni.isSelected()) {
            count++;
            items.append(pepperoni.getText()).append("\n");
        }
        if (ham.isSelected()) {
            count++;
            items.append(ham.getText()).append("\n");
        }
        if (sausage.isSelected()) {
            count++;
            items.append(sausage.getText()).append("\n");
        }
        if (chicken.isSelected()) {
            count++;
            items.append(chicken.getText()).append("\n");
        }
        if (greenpepper.isSelected()) {
            count++;
            items.append(greenpepper.getText()).append("\n");
        }
        if (mushroom.isSelected()) {
            count++;
            items.append(mushroom.getText()).append("\n");
        }
        if (blackolive.isSelected()) {
            count++;
            items.append(blackolive.getText()).append("\n");
        }
        if (onion.isSelected()) {
            count++;
            items.append(onion.getText()).append("\n");
        }
        if (spinach.isSelected()) {
            count++;
            items.append(spinach.getText()).append("\n");
        }

        lblnoitems.setText(String.valueOf(count));
        lblitems.setText(items.toString());
    }
}
