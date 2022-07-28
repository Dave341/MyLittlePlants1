package com.upchiapas.mylittleplants.controllers;

import com.upchiapas.mylittleplants.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;


public class HomeController {
    @FXML
    private Button btnbuscar;

    @FXML
    private Button btncerrarSeseion;

    @FXML
    private MenuButton btncatalogo;

    @FXML
    private MenuItem acuaticas;

    @FXML
    private MenuItem btnterrestres;

    @FXML
    private MenuItem btnnocturnas;

    @FXML
    private Button btncarroProductos;

    @FXML
    private Button btnherramientas;

    @FXML
    void btncerrarSesionOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Inicio de Sesion - MLP","Login-view");
    }
    @FXML
    void btnbuscarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Busqueda - MLP","busqueda-view");
    }
    @FXML
    void btncarritoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Carrito - MLP","shoppingtrolley-view");
    }
    @FXML
    void btnherramientasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Herramientas - MLP","producttool-view");
    }

    @FXML
    void btncatalogoOnMouseClicked(MouseEvent event) {
    }
    @FXML
    void btnacuaticasOnMouseCliecked(ActionEvent event) {
        HelloApplication.setFxml("Plantas Acuaticas - MLP","acuaticplants-view");
    }
    @FXML
    void btnnocturnasOnMouseCliecked(ActionEvent event) {
        HelloApplication.setFxml("Plantas Nocturnas - MLP","nightplants-view");
    }
    @FXML
    void btnterrestreOnMouseCliecked(ActionEvent event) {
        HelloApplication.setFxml("Plantas Terrestres - MLP","landplants-view");
    }

}

