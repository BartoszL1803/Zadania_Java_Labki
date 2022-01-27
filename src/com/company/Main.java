package com.company;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("felis");
        cat.name = "Futrzak";

        Human me = new Human();
        me.firstName = "Bartosz";
        me.lastName = "Lissowski";

        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
    }
}