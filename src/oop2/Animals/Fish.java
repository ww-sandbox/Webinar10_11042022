package oop2.Animals;

import oop.Animals.Animal;

public class Fish extends Animal {

    Fish(String name){
        super(name);
        this.color = "gold";
    }

    @Override
    public void useVoice() {
    }

    @Override
    public String toString(){
        return "Ryba | nazwa=" + this.getName();
    }

    @Override
    public void move() {

    }
}
