package com.upchiapas.mylittleplants.models;

public class Plant {

    protected String nombre;
    protected int precio;
    protected String genero;

    public Plant(String nombre, int precio, String genero) {
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setgenero(String caracteristica) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+". Precio: "+ precio+". Genero: "+genero+".\n";
    }
}
