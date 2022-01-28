package com.company;

public class Animal implements Saleable {

    final String species;
    private Double weight;
    Boolean alive;
    String name;
    Boolean forSale;

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

    public String toString() {
        return species +" "+ name;
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (this.forSale == true && buyer.cash >= price) {
            buyer.animal = this;
            seller.animal = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.toString() +" kupił od "+ seller.toString() +" zwierzę "+ this.toString());
        }else {
            System.out.println("ta transakcja jest nie możliwa do przeprowadzenia ze względów ekonomicznych lub etycznych!");
        }
    }
}