package com.upchiapas.mylittleplants.models;

import java.util.ArrayList;

public class StoreTool {
    private static ArrayList<Tool> Herramientas = new ArrayList<>();
    public static void herramienta(){
        Herramientas.add(new Tool("Azadon",260,"Truper"));
        Herramientas.add(new Tool("Pala",340,"Festool"));
        Herramientas.add(new Tool("Rastrillo",270,"Truper"));
        Herramientas.add(new Tool("Machete",420,"Festool"));
        Herramientas.add(new Tool("Abono",260,"MLP"));
        Herramientas.add(new Tool("Fertilizante",260,"MLP"));
        Herramientas.add(new Tool("Carretilla",260,"Truper"));
        Herramientas.add(new Tool("Laya de doble mango",260,"Festool"));
        Herramientas.add(new Tool("Maceta",260,"MLP"));
        Herramientas.add(new Tool("Almocafre",260,"Truper"));
    }

    public static ArrayList<Tool> getHerramientas() {
        return Herramientas;
    }

    public static void setListHerramientas(ArrayList<Tool> Herramientas) {
        StoreTool.Herramientas = Herramientas;
    }
}
