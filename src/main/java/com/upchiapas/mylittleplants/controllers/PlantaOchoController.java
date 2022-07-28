package com.upchiapas.mylittleplants.controllers;


import com.upchiapas.mylittleplants.HelloApplication;
import com.upchiapas.mylittleplants.models.CatalogoPlanta;
import com.upchiapas.mylittleplants.models.User;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;

public class PlantaOchoController {

    @FXML
    void btnAgregarOnMouseClicked(MouseEvent event) {
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
    void btnbackOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Plantas Terrestres - MLP","landplants-view");
    }

}
