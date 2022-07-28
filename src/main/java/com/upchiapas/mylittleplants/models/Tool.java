package com.upchiapas.mylittleplants.models;

public class Tool {

    private String nombre;
    private int precio;
    private String marca;

    public Tool(String nombre, int precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+". Precio: "+ precio+". Marca: "+marca+".\n";
    }
}