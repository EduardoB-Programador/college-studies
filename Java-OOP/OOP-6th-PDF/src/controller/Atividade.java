package controller;

import model.*;

public class Atividade {
    public static void main(String[] args) {

        Reptile alligator = new Reptile("Alligatoridae", "Scales", "Lay eggs", "Carnivore", 4, false);
        Reptile lizard = new Reptile("Hemidactylus mabouia", "Scales", "Lay eggs", "Carnivore", 4, true);
        Mammal dog = new Mammal("Canis lupus familiaris", "Fur", "Gives birth", "Carnivore", 4, "Terrestrial");
        Mammal whale = new Mammal("Balaenoptera physalus", "Skin", "Gives birth", "Carnivore", 0, "Aquatic");

        alligator.showInfo();
        lizard.showInfo();
        dog.showInfo();
        whale.showInfo();

    }
}
