package com.company;

public class Animal {

    final String species;
    private Double weight;
    Boolean alive;
    String name;

    Animal(String species) {
        this.species = species;
        alive = true;


        if (this.species == "canis") {
            this.weight = 10.0;
        } else if (this.species == "felis") {
            this.weight = 2.0;
        } else {
            this.weight = 1.0;
        }
    }

    void feed() {
        if (this.weight <= 0.0){
            System.out.println("You can't feed a dead animal.");
        }else this.weight++;
    }
    void takeForAWalk() {
        if (this.weight <= 0.0){
            alive = false;
            System.out.println("You can't take your animal for a walk beacause is dead.");
        }else this.weight--;
    }
}