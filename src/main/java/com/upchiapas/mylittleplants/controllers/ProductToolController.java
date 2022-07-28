package com.upchiapas.mylittleplants.controllers;

import com.upchiapas.mylittleplants.HelloApplication;
import com.upchiapas.mylittleplants.models.CatalogoPlanta;
import com.upchiapas.mylittleplants.models.StoreTool;
import com.upchiapas.mylittleplants.models.Tool;
import com.upchiapas.mylittleplants.models.User;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class ProductToolController {

    @FXML
    private Button btnhome;

    @FXML
    private Button btnagregar1;

    @FXML
    private Button btnagregar2;

    @FXML
    private Button btnagregar3;

    @FXML
    private Button btnagregar4;

    @FXML
    private Button btnagregar5;

    @FXML
    private Button btnagregar8;

    @FXML
    private Button btnagregar7;

    @FXML
    private Button btnagregar6;

    @FXML
    private Button btnagregar9;

    @FXML
    private Button btnagregar10;

    @FXML
    void btnhomeOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Inicio - MLP","home-view");
    }
    @FXML
    void btnCarritoOnMouseCicked(MouseEvent event) {
        HelloApplication.setFxml("Carrito - MLP","shoppingtrolley-view");
    }

    @FXML
    void btnagregar1OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Azadon")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnagregar2OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Pala")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnagregar3OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Rastrillo")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnagregar4OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Machete")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnagregar5OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Abono")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnagregar6OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Fertilizante")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnagregar7OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Carretilla")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnagregar8OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Laya de doble mango")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnagregar9OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Maceta")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnagregar10OnMouseClicked(MouseEvent event) {
        StoreTool.herramienta();
        int index = 0;
        boolean status = false;
        while (!status && index< StoreTool.getHerramientas().size()){
            if (StoreTool.getHerramientas().get(index).getNombre().equals("Almocafre")){
                User.setListherramienta(StoreTool.getHerramientas().get(index));
                status = true;
            }
            index++;
        }
        if (!status){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Planta No Agregada:(");
            alert.showAndWait();
        }
    }
}

