package com.example.javafx_ajouter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField textFieldName;
    @FXML
    ListView<String> ListView1;


    @FXML
    public void addSubject() {
      String nom = textFieldName.getText();
      ListView1.getItems().add(nom);
    }
}