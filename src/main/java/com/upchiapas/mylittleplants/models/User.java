package com.upchiapas.mylittleplants.models;

import java.util.ArrayList;

public class User {
    private String name;
    private String userName;
    private String password;
    private String mail;
    private static ArrayList<Plant> listplant = new ArrayList<>();
    private static ArrayList<Tool> listherramienta= new ArrayList<>();

    public User(String name, String userName, String password, String mail) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passwored) {
        this.password = passwored;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static ArrayList<Plant> getListplant() {
        return listplant;
    }

    public static void setListplant(Plant planta) {
        User.listplant.add(planta);
    }

    public static ArrayList<Tool> getListherramienta() {
        return listherramienta;
    }

    public static void setListherramienta(Tool tool ) {
        User.listherramienta.add(tool);
    }
}
