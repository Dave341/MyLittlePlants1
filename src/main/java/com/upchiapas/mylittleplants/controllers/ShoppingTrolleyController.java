package com.upchiapas.mylittleplants.controllers;

import com.upchiapas.mylittleplants.HelloApplication;
import com.upchiapas.mylittleplants.models.User;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class ShoppingTrolleyController {

    @FXML
    private Label txttotal;

    @FXML
    private TextArea txtplant;

    @FXML
    private TextArea txttool;

    @FXML
    private Button btnhome;

    @FXML
    private Button btnpagar;

    @FXML
    private TextField txteliminar;

    @FXML
    private Button btneliminar;

    @FXML
    void btnhomeOnMauseClicked(MouseEvent event) {
        HelloApplication.setFxml("Home - TripAdvisor","home-view");
    }
    @FXML
    void btneliminarOnMouseClicked(MouseEvent event) {
        boolean status = false;
        int index = 0;
        while (!status && index<User.getListplant().size()){
            if(User.getListplant().get(index).getNombre().equals(txteliminar.getText())){
                User.getListplant().remove(index);
                status = true;
            }
            index++;
        }
        index=0;
        while (!status && index<User.getListherramienta().size()){
            if(User.getListherramienta().get(index).getNombre().equals(txteliminar.getText())){
                User.getListherramienta().remove(index);
                status = true;
            }
            index++;
        }
    }

    @FXML
    void btnverProductosOnMouseClicked(MouseEvent event) {
        String productosPlants = " ",productosTool="";
        for(int i = 0; i< User.getListplant().size(); i++){
            productosPlants+=User.getListplant().get(i).toString();
        }
        for(int i = 0; i<User.getListherramienta().size();i++){
            productosTool+=User.getListherramienta().get(i).toString();
        }
        txtplant.setText(productosPlants);
        txttool.setText(productosTool);
        txttotal.setText(sumaPrecioTotal()+"");
    }
    private int sumaPrecioPlant(){
        int primerTotal = 0;
        for (int index = 0; index<User.getListplant().size(); index++) {
            primerTotal += User.getListplant().get(index).getPrecio();
        }
        return primerTotal;
    }
    private int sumaPrecioTool(){
        int segundoTotal = 0;
        for (int index = 0; index<User.getListherramienta().size(); index++) {
            segundoTotal += User.getListherramienta().get(index).getPrecio();
        }
        return segundoTotal;
    }
    private int sumaPrecioTotal(){
        int precioTotal = 0;
        precioTotal=sumaPrecioPlant()+sumaPrecioTool();
        return precioTotal;
    }
    @FXML
    void btnpagarOnMouseClicked(MouseEvent event) {
        if(!User.getListplant().isEmpty() || !User.getListherramienta().isEmpty()){
            HelloApplication.setFxml("MLP","ticket-view");
            User.getListplant().clear();
            User.getListherramienta().clear();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("No es Posible Realizar el Pago :(");
            alert.showAndWait();
        }
    }
}
