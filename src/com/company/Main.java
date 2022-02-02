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
        car1.value = 15000.0;
        car1.forSale = true;

        LPG car2 = new LPG("BMW", "E36", 2002);
        car2.millage = 220000.0;
        car2.color = "black";
        car2.value = 15000.0;

        Electric car3 = new Electric("Tesla", "X", 2020);
        car3.value = 10000.0;

        LPG car4 = new LPG("VW","Golf",2005);
        car4.value = 8000.0;

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
        human2.cash = 50000.0;

        Human human3 = new Human();
        human3.firstName = "Andrzej";
        human3.lastName = "Tosieuda";
        human3.cash = 50000.0;

        human2.setSalary(20000);

        me.setSalary(3600);
        me.getSalary();

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

        //dog.sell(human2, me, 1000.0);
        //phone1.sell(me, human2, 799.0);

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

        me.setCar(car1,2);
        me.setCar(car4,1);
        me.setCar(car3,0);

        human2.setCar(car2,1);

        me.garageValue();

        me.sortGarage();

        human2.garageValue();

        human2.sortGarage();

        car4.sell(me,human2,5000.0);

        me.garageValue();

        me.sortGarage();

        human2.garageValue();

        human2.sortGarage();

        car4.showOwners();

        car4.actualOwner();

        car1.actualOwner();

        car2.everOwner(me);
        car2.everOwner(human2);
        car4.everOwner(me);
        car4.everOwner(human2);

        car4.everTrade(me,human2);

        car4.numberOfTransaction();

        car4.sell(human2,human3,5000.0);
        car4.numberOfTransaction();

        car1.numberOfTransaction();

        Application app1 = new Application("Facebook",2.0,7.0);
        Application app2 = new Application("Youtube",1.0,0.0);
        Application app3 = new Application("Instagram",1.3,11.0);
        Application app4 = new Application("Netflix",1.5,0.0);
        Application app5 = new Application("Notepad pro",1.7,20.0);

        phone1.buyAndInstall(me,app1);
        phone1.buyAndInstall(me,app2);
        phone1.buyAndInstall(me,app3);
        phone1.buyAndInstall(me,app4);
        //phone1.buyAndInstall(me,app5);

        System.out.println(phone1.listOfApp.toString());

        phone1.checkApp(app1);
        phone2.checkApp(app1);

        phone1.checkAppWithName("Facebook");
        phone1.checkAppWithName("Notepad pro");

        phone1.showFreeApp();

        phone1.installedAppValue();

        phone1.showAppAlphabetically();

        phone1.showAppPriceAsc();
    }
}