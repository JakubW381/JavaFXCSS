package com.example.modelcss;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    Text header;
    @FXML
    Text bodytext;

    Stage stage;
    Scene scene;
    Parent root;

    @FXML
    private void mainPage(ActionEvent event){
        header.setText("Main Page");
        bodytext.setText("some text on main page");
    }
    @FXML
    private void level1(ActionEvent event){
        header.setText("Level 1");
        bodytext.setText("some text on Level 1");
    }
    @FXML
    private void stage2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void stage1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Model.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void loginScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void exit(ActionEvent event){
        Platform.exit();
    }
}
