package com.upchiapas.mylittleplants.models;

import com.upchiapas.mylittleplants.extendsplants.AcuaticPlant;
import com.upchiapas.mylittleplants.extendsplants.LandPlant;
import com.upchiapas.mylittleplants.extendsplants.NightPlants;

import java.util.ArrayList;

public class CatalogoPlanta {
    private static ArrayList<Plant>plants = new ArrayList<>();

    public static void catalogo(){
        plants.add(new AcuaticPlant("Flor de loto",400,"Nelumbo"));
        plants.add(new AcuaticPlant("Lechuga de agua",250,"Pistia L."));
        plants.add(new AcuaticPlant("Lechuga de mar",300,"Ulva"));
        plants.add(new AcuaticPlant("Jancito de agua",280,"Eichhornia"));
        plants.add(new AcuaticPlant("Nenufar blanco europeo",430,"Nymphaea"));
        plants.add(new AcuaticPlant("Papiro",280,"ciperáceas"));
        plants.add(new AcuaticPlant("Lirio de agua",250,"Liliopsida"));
        plants.add(new AcuaticPlant("Lenteja de agua",200,"Lemma"));
        plants.add(new AcuaticPlant("Myriophyllum verticillatum",300,"Myriophyllum"));
        plants.add(new AcuaticPlant("Flecha verde",180,"Arum"));
        plants.add(new LandPlant("Sandia",150,"Citrullus"));
        plants.add(new LandPlant("Melon",150,"Cucumis"));
        plants.add(new LandPlant("Rabanos",160,"Paphanus"));
        plants.add(new LandPlant("Zanaoria",170,"Daucus"));
        plants.add(new LandPlant("Tomate",150,"Solanum"));
        plants.add(new LandPlant("Papa",160,"Salanum"));
        plants.add(new LandPlant("Maiz",170,"Zea"));
        plants.add(new LandPlant("Calabaza",170,"Cucurbita"));
        plants.add(new LandPlant("Mango",160,"Mangifera"));
        plants.add(new LandPlant("Guayabo",190,"Psidium"));
        plants.add(new NightPlants("Orquidia de noche",190,"Bulbophyllum"));
        plants.add(new NightPlants("Flor de luna",200,"Ipomoea"));
        plants.add(new NightPlants("Magnolia de noche",180,"Magnolia .L"));
        plants.add(new NightPlants("Cereus",250,"Bacilius"));
        plants.add(new NightPlants("Onagra",300,"Onagras"));
        plants.add(new NightPlants("Margarita de chocolate",220,"Bellis"));
        plants.add(new NightPlants("Flor de Jazmin",290,"Jasminum"));
        plants.add(new NightPlants("Trompeta de angel",250,"Brugmansia"));
        plants.add(new NightPlants("Dama de la noche",240,"Cestrum"));
        plants.add(new NightPlants("Wisteria japonesa",480,"Glicinas"));
    }

    public static ArrayList<Plant> getPlants() {
        return plants;
    }

    public static void setPlants(ArrayList<Plant> plants) {
        CatalogoPlanta.plants = plants;
    }
}
