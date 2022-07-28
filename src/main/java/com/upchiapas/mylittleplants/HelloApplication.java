package com.upchiapas.mylittleplants;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Scene scene;
    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        scene = new Scene(loadFXML("login-view"));
        stage.setTitle("My Little Plant");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
    public static void setFxml(String title, String name){
        scene.setRoot(loadFXML(name));
        stage.setResizable(true);
        stage.sizeToScene();
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setTitle(title);
    }

    private static Parent loadFXML(String name) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(name+".fxml"));
        try {
            return fxmlLoader.load();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}