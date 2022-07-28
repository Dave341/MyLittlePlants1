package com.upchiapas.mylittleplants.controllers;

import com.upchiapas.mylittleplants.HelloApplication;
import com.upchiapas.mylittleplants.models.CatalogoPlanta;
import com.upchiapas.mylittleplants.models.Plant;
import com.upchiapas.mylittleplants.models.User;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.Iterator;

public class BusquedaController {

    @FXML
    private Label buscar;

    @FXML
    private Button btnhome;

    @FXML
    private Button btnagregar;

    @FXML
    private Button btnver;

    @FXML
    private TextField txtbuscar;

    @FXML
    void btnagregarOnMouseClicked(MouseEvent event) {
        int index = buscar();
        if(index != -1 ){
            User.setListplant(CatalogoPlanta.getPlants().get(index));
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("No Agregado :(");
            alert.showAndWait();
        }
    }

    @FXML
    void btnhomeOnMouseClicked(MouseEvent event) {
        HelloApplication.setFxml("Inicio - MLP","home-view");
    }

    @FXML
    void btnbuscarOnMouseClicked(MouseEvent event) {
        buscar();
    }

    public int buscar(){
        CatalogoPlanta.catalogo();
        Iterator<Plant> iterator = CatalogoPlanta.getPlants().iterator();
        boolean status = false;
        int index = -1;
        while (!status && iterator.hasNext()){
            index++;
            if(iterator.next().getNombre().equals(txtbuscar.getText())){
                buscar.setText("Nombre de la planta:\n"
                        +CatalogoPlanta.getPlants().get(index).getNombre()
                        +"\nPrecio de la Planta:\n"
                        +CatalogoPlanta.getPlants().get(index).getPrecio()
                        +"\nGenero:\n"
                        +CatalogoPlanta.getPlants().get(index).getGenero());
                status = true;
            }
        }
        if (!status){
            index=-1;
        }
        return index;
    }
}
