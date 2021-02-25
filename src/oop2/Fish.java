package oop2;

import oop.Animal;

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
