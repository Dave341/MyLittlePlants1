module com.upchiapas.mylittleplants {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.mylittleplants to javafx.fxml;
    exports com.upchiapas.mylittleplants;
    exports com.upchiapas.mylittleplants.controllers;
    opens com.upchiapas.mylittleplants.controllers to javafx.fxml;
}