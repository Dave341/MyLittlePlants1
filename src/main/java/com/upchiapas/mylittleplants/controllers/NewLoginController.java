package com.upchiapas.mylittleplants.controllers;

import com.upchiapas.mylittleplants.HelloApplication;
import com.upchiapas.mylittleplants.models.User;
import com.upchiapas.mylittleplants.models.ValidarNewUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class NewLoginController {

    @FXML
    private TextField name;

    @FXML
    private TextField userName;

    @FXML
    private TextField mail;

    @FXML
    private PasswordField password;

    @FXML
    private Button btncreateUser;

    @FXML
    private Button btnexit;

    @FXML
    private Button btniniciarSesion;

    @FXML
    void btncreateUserOnMouseClicked(MouseEvent event) {
        if(ValidarNewUser.validaruser(userName.getText(), password.getText(), name.getText(), mail.getText())){
            ValidarNewUser.setLitsuser(new User(name.getText(),userName.getText(),password.getText(),mail.getText()));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Info ");
            alert.setContentText("Cuenta Creada :)");
            alert.showAndWait();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Este Usuario Ya Existe u Algun Dato no Esta Completo :(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnexitOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void btnloginOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Inicio de Sesion - MLP","login-view");
    }
}