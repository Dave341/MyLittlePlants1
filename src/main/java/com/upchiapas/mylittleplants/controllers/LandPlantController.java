package com.upchiapas.mylittleplants.controllers;

import com.upchiapas.mylittleplants.HelloApplication;
import com.upchiapas.mylittleplants.models.CatalogoPlanta;
import com.upchiapas.mylittleplants.models.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

public class LandPlantController {

    @FXML
    private Button btnhome;

    @FXML
    private Button btncarrito;

    @FXML
    private MenuButton btncatalogo;

    @FXML
    private MenuItem btnacuatica;

    @FXML
    private MenuItem btnnocturnas;

    @FXML
    private Button btnagregar1;

    @FXML
    private Button btnverPlant1;

    @FXML
    private Button btnverPlant2;

    @FXML
    private Button btnagregar2;

    @FXML
    private Button btnverPlant3;

    @FXML
    private Button btnagregar3;

    @FXML
    private Button btnverPlant4;

    @FXML
    private Button btnagregar4;

    @FXML
    private Button btnverPlant5;

    @FXML
    private Button btnagregar5;

    @FXML
    private Button btnverPlant8;

    @FXML
    private Button btnagregar8;

    @FXML
    private Button btnverPlant7;

    @FXML
    private Button btnagregar7;

    @FXML
    private Button btnverPlant6;

    @FXML
    private Button btnagregar6;

    @FXML
    private Button btnverPlant9;

    @FXML
    private Button btnagregar9;

    @FXML
    private Button btnverPlant10;

    @FXML
    private Button btnagregar10;

    @FXML
    void btnhomeOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Inicio - MLP","home-view");
    }
    @FXML
    void btncarritoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Carrito - MLP","shoppingtrolley-view");
    }
    @FXML
    void btncatalogoOnMouseClicked(MouseEvent event) {

    }
    @FXML
    void btnacuaticasOnMouseClicked(ActionEvent event) {
        HelloApplication.setFxml("Plantas Acuaticas - MLP","acuaticplants-view");
    }
    @FXML
    void btnnocturnaOnMouseClicked(ActionEvent event) {
        HelloApplication.setFxml("Plantas Nocturnas - MLP","nightplants-view");
    }

    @FXML
    void btnagregar1OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Lenteja de agua")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver1OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Sandia - MLP","plantauno-view");
    }

    @FXML
    void btnagregar2OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Melon")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver2OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Melon - MLP","plantados-view");
    }

    @FXML
    void btnagregar3OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Rabanos")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver3OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Rabano - MLP","plantatres-view");
    }

    @FXML
    void btnagregar4OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Zanaoria")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver4OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Zanaoria - MLP","plantacuatro-view");
    }

    @FXML
    void btnagregar5OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Tomate")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver5OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Tomate - MLP","plantacinco-view");
    }

    @FXML
    void btnagregar6OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Papa")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver6OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Papa - MLP","plantaseis-view");
    }

    @FXML
    void btnagregar7OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Maiz")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver7OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Maiz - MLP","plantasiete-view");
    }

    @FXML
    void btnagregar8OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Calabaza")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver8OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Calabaza - MLP","plantaocho-view");
    }

    @FXML
    void btnagregar9OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Mango")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver9OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Mango - MLP","plantanueve-view");
    }

    @FXML
    void btnagregar10OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Guayabo")){
                User.setListplant(CatalogoPlanta.getPlants().get(index));
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
    void btnver10OnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Guayabo - MLP","plantadies-view");
    }
}
