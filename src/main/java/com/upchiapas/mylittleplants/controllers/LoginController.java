package com.upchiapas.mylittleplants.controllers;

import com.upchiapas.mylittleplants.HelloApplication;
import com.upchiapas.mylittleplants.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private PasswordField password;

    @FXML
    private TextField userName;

    @FXML
    private Button btniniciarSecion;

    @FXML
    private Button btnSalir;

    @FXML
    private Button bthcrearUsuario;

    @FXML
    void btncrearCuentaOnMausCliked(MouseEvent event) {
        HelloApplication.setFxml("My Little Plant","newlogin-view");
    }

    @FXML
    void btniniciarSesionOnMouseClicked(MouseEvent event) {
        ValidateUser user = new ValidateUser();
        if(user.autenticarUser(userName.getText(), password.getText())){
            HelloApplication.setFxml("Inicio - MLP","home-view");
            /*Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login - Info ");
            alert.setContentText("Bienvanido al Sistema :)");
            alert.showAndWait();*/
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("El Usuario No Existe :(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnsalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

}