package com.company;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("felis");
        cat.name = "Futrzak";

        Car car1 = new Car ("Renault", "Megane");
        car1.yearOfProduction = 2011;
        car1.millage = 120000.0;
        car1.color = "grey";

        Human me = new Human();
        me.firstName = "Bartosz";
        me.lastName = "Lissowski";
        me.car = car1;

        me.setSalary(2000);
        me.getSalary();

        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
    }
}