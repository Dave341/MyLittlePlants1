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

public class NightPlantsController {

    @FXML
    private Button btnhome;

    @FXML
    private Button btncarrito;

    @FXML
    private MenuButton btncatalogo;

    @FXML
    private MenuItem btnacuaticas;

    @FXML
    private MenuItem btnterrestres;

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
    void btncatalogoOnMouseClicked(MouseEvent event) {}
    @FXML
    void btnacuaticaOnMouseClicked(ActionEvent event) {
        HelloApplication.setFxml("Plantas Acuaticas - MLP","acuaticplants-view");
    }
    @FXML
    void btnterrestreOnMouseClicked(ActionEvent event) {
        HelloApplication.setFxml("Plantas Terrestres - MLP","landplants-view");
    }

    @FXML
    void btnagregar1OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Orquidia de noche")){
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
        HelloApplication.setFxml("Orquidia de noche - MLP","plantaveintiuno-view");
    }

    @FXML
    void btnagregar2OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Flor de luna")){
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
        HelloApplication.setFxml("Flor luna - MLP","plantaveintidos-view");
    }

    @FXML
    void btnagregar3OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Magnolia de noche")){
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
        HelloApplication.setFxml("Magnolia de noche - MLP","plantaveintitres-view");
    }

    @FXML
    void btnagregar4OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Cereus")){
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
        HelloApplication.setFxml("Cereus - MLP","plantaveinticuatro-view");
    }

    @FXML
    void btnagregar5OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Onagra")){
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
        HelloApplication.setFxml("Onagra - MLP","plantaveinticinco-view");
    }

    @FXML
    void btnagregar6OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Margarita de chocolate")){
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
        HelloApplication.setFxml("Margarita de chocolate - MLP","plantaveintiseis-view");
    }

    @FXML
    void btnagregar7OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Flor de Jazmin")){
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
        HelloApplication.setFxml("Flor de Jazmin - MLP","plantaveintisiete-view");
    }

    @FXML
    void btnagregar8OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Trompeta de angel")){
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
        HelloApplication.setFxml("Trompeta de angel - MLP","plantaveintiocho-view");
    }

    @FXML
    void btnagregar9OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Dama de la noche")){
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
        HelloApplication.setFxml("Dama de la noche - MLP","plantaveintinueve-view");
    }

    @FXML
    void btnagregar10OnMouseClicked(MouseEvent event) {
        CatalogoPlanta.catalogo();
        int index = 0;
        boolean status = false;
        while (!status && index< CatalogoPlanta.getPlants().size()){
            if (CatalogoPlanta.getPlants().get(index).getNombre().equals("Wisteria japonesa")){
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
        HelloApplication.setFxml("Wisteria japonesa - MLP","plantatreinta-view");
    }
}
