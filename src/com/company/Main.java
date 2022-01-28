package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("felis");
        cat.name = "Futrzak";

        Animal dog = new Animal("canis");
        dog.name = "Pieseł";
        dog.forSale = false;

        Car car1 = new Car("Renault", "Megane", 2011);
        car1.millage = 120000.0;
        car1.color = "grey";
        car1.value = 22000.0;
        car1.forSale = true;

        Car car2 = new Car("BMW", "E36", 2002);
        car2.millage = 220000.0;
        car2.color = "black";
        car2.value = 13500.0;

        System.out.println(car1.equals(car2));

        Phone phone1 = new Phone("Xiaomi", "Redmi Note 10", 2021);
        phone1.screenSize = 6.43;
        phone1.OS = "Android";
        phone1.forSale = true;

        Phone phone2 = new Phone("Iphone", "11", 2019);
        phone2.screenSize = 6.1;
        phone2.OS = "IOS";

        Human me = new Human();
        me.firstName = "Bartosz";
        me.lastName = "Lissowski";
        me.cash = 1000000.0;

        Human human2 = new Human();
        human2.firstName = "Janusz";
        human2.lastName = "Polak";
        human2.cash = 1000.0;

        me.setSalary(3600);
        me.getSalary();

        me.setCar(car2);

        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();

        System.out.println(cat);
        System.out.println(me);
        System.out.println(car2);
        System.out.println(phone1);

        car2.turnOn();
        phone1.turnOn();

        dog.sell(human2, me, 1000.0);
        phone1.sell(me, human2, 799.0);
        car1.sell(human2, me, 20000.0);
    }
}