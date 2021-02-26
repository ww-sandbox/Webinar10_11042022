package oop;

import oop.Animals.Animal;
import oop.Animals.Cat;
import oop.Animals.Dog;

public class AnimalsWorld {
    public static void main(String[] args) {
        /*
            PRZED URUCHOMIENIEM KLASY ZAIMPLEMENTUJ KONSTRUKTORY Z PARAMETREM!!
         */

        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Azor");
        animals[1] = new Dog("Szarik");
        animals[2] = new Cat("Mruczek");
        animals[3] = new Dog("Scooby");
        animals[4] = new Cat("Garfield");

        animals[3].printInfo();
    }
}
