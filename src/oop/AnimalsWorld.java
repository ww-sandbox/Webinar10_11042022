package oop;

import oop.Animals.*;

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

        System.out.println(BlackCat.COLOR);
        BlackCat.unluck();

        BlackCat bcat = new BlackCat("kot");
        bcat.printInfo();
        bcat.setName("inna nazwa");
        bcat.printInfo();
//        bcat.name = "01230";
//        Jeśli w Animal 'name' miałoby modyfikator ustawiony na 'public' moglibyśmy tutaj zmienić wartość tego pola.
//        Nie jest to porządane, dlatego stosujemy 'private' i setter, który może np. walidować wartości
//        bcat.validateName("0123");
//        Nie mamy dostępu do metody prywatnej (private) z żadnej innej klasy
        bcat.printInfo();
        bcat.pet();
        System.out.println(bcat.getColor());
        System.out.println(BlackCat.COLOR);

        Dog dog = new Dog("reks");
//        dog.pet();
        Petable petableAnimal;
//        Można stworzyć zmienną typu Petable (interfejs), ale nie można stworzyć obiektu tego typu, a jedynie typów
//        implementujących ten interfejs
        petableAnimal = dog;
        petableAnimal.pet();
        petableAnimal = bcat;
        petableAnimal.pet();
    }
}
