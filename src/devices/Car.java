package devices;

import com.company.Human;
import com.company.Saleable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Saleable {

    public Double millage;
    public String color;
    public Boolean forSale;
    public List<Human> owners = new ArrayList<>();

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public boolean equals(Car car) {
        if (this  == car){
            return true;
        } else if (this.producer.equals(car.producer)
                && this.model.equals(car.model)
                && this.yearOfProduction.equals(car.yearOfProduction)
                && this.millage.equals(car.millage)
                && this.color.equals(car.color)
                && this.value.equals(car.value)) {
            return true;
        } else {
            return false;
        }
    }

    public void turnOn() {
        System.out.println("przekręcasz kluczyk");
    }

    public void sell(Human seller, Human buyer, Double price) {
       if (buyer.cash < price) {
           System.out.println("kupiec nie ma pieniędzy na przeprowadzenie transakcji");
       } else if (!buyer.hasFreeParkingLot()) {
           System.out.println("kupiec nie ma wolnego miejsca parkingowego");
       }else if (!seller.hasCar(this)) {
           System.out.println("sprzedawca nie posiada takiego samochodu");
       } else if (!seller.isOwner(this,seller)){
           System.out.println("sprzedawca nie jest właścicielem samochodu");
        } else {
           seller.garage[seller.removeCar(this)] = null;
           buyer.garage[buyer.addCar()] = this;
           seller.cash += price;
           buyer.cash -= price;
           this.owners.add(buyer);
           System.out.println(buyer +" kupił od "+ seller +" samochód "+ this);
           System.out.println("gotówka sprzedającego: " +seller.cash);
           System.out.println("gotówka kupca: " +buyer.cash);
       }
    }

    public void showOwners(){
        System.out.println("historia właścicieli: " + owners);
    }

    public void actualOwner() {
        System.out.println("aktualny właściciel pojazdu: "+ owners.get(owners.size()-1));
    }

    public boolean everOwner(Human human) {
        if (owners.contains(human)) {
            System.out.println(human +" był właścicielem pojazdu "+ this);
            return true;
        }
        System.out.println(human +" nie był właścicielem pojazdu "+ this);
        return false;
    }

    public void everTrade(Human seller, Human buyer) {
        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i) == seller && owners.get(i + 1) == buyer) {
                System.out.println(seller + " sprzedał kiedyś " + this + " " + buyer);
                break;
            } else {
                System.out.println("nie doszło nigdy do takiej transakcji");
            }
        }
    }

    public void numberOfTransaction() {
        int i = owners.size()-1;
        if (i >0)
            System.out.println(this +" uczestniczył w "+ i +" transakcjach");
        else
            System.out.println(this +" nie uczestniczył w żadnej transakcji");
    }

    public abstract void refuel();
}