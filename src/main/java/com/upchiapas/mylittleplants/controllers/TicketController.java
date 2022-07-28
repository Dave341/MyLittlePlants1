package com.upchiapas.mylittleplants.controllers;

import com.upchiapas.mylittleplants.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;

public class TicketController {

    @FXML
    private Button btnhome;

    @FXML
    private MenuButton btnopcion;

    @FXML
    void btncerrarSecion(ActionEvent event) {
        HelloApplication.setFxml("Inicio de Sesion - MLP","login-view");
    }

    @FXML
    void btnhomeOnMauseClicked(MouseEvent event) {
        HelloApplication.setFxml("Inicio - MLP","home-view");
    }

    @FXML
    void btnopcionOnMouseClicked(MouseEvent event) {
    }

}
