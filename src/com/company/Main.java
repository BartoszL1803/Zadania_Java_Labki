package com.company;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("felis");
        cat.name = "Futrzak";

        Car car1 = new Car ("Renault", "Megane");
        car1.yearOfProduction = 2011;
        car1.millage = 120000.0;
        car1.color = "grey";
        car1.value = 22000.0;

        Car car2 = new Car ("BMW", "E36");
        car2.yearOfProduction = 2002;
        car2.millage = 220000.0;
        car2.color = "black";
        car2.value = 13500.0;

        Human me = new Human();
        me.firstName = "Bartosz";
        me.lastName = "Lissowski";

        me.setSalary(3600);
        me.getSalary();

        me.setCar(car2);

        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
    }
}