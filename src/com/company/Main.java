package com.company;

import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        Pet cat = new Pet("felis", 2.0);
        cat.name = "Futrzak";

        Pet dog = new Pet("canis", 10.0);
        dog.name = "Pieseł";
        dog.forSale = false;

        FarmAnimal pig = new FarmAnimal("sus domestica", 350.0);
        pig.name = "Pepa";

        Disel car1 = new Disel("Renault", "Megane", 2011);
        car1.millage = 120000.0;
        car1.color = "grey";
        car1.value = 22000.0;
        car1.forSale = true;

        LPG car2 = new LPG("BMW", "E36", 2002);
        car2.millage = 220000.0;
        car2.color = "black";
        car2.value = 13500.0;

        Electric car3 = new Electric("Tesla", "X", 2020);

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

        pig.beEaten();
        pig.beEaten();

        dog.feed(5.0);

        phone1.installAnApp("Youtube");

        phone1.installAnApp("Notepad", "1.13");

        phone1.installAnApp("Cda.pl", "1.08", "Cda.pl");

        List<String> appNames = new LinkedList<>();
        appNames.add("Facebook");
        appNames.add("Instagram");

        phone1.installAnApp(appNames);

        URL url1 = new URL("https","wsb.pl",442,"Extranet-1.6");

        phone2.installAnApp(url1);

        car1.refuel();
        car2.refuel();
        car3.refuel();
    }
}