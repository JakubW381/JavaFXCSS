package com.example.modelcss;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginSceneController {
    Parent root;
    Scene scene;
    Stage stage;
    String username;
    @FXML
    TextField usernameField = new TextField();
    @FXML
    Text welcomeText = new Text();



    @FXML
    private void login(ActionEvent event) throws IOException {
        username = usernameField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UserPage.fxml"));
        root = loader.load();
        LoginSceneController controller = loader.getController();
        controller.setWelcomeText("Hello: " + username);
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void setWelcomeText(String text) {
        welcomeText.setText(text);
    }

    @FXML
    private  void backButton(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Model.fxml"));
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }









}
