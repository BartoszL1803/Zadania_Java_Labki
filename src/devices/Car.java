package devices;

import com.company.Human;
import com.company.Saleable;

public abstract class Car extends Device implements Saleable {

    public Double millage;
    public String color;
    public Boolean forSale;

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
       } else {
           seller.garage[seller.removeCar(this)] = null;
           buyer.garage[buyer.addCar()] = this;
           seller.cash += price;
           buyer.cash -= price;
           System.out.println(buyer +" kupił od "+ seller +" samochód "+ this);
           System.out.println("gotówka sprzedającego: " +seller.cash);
           System.out.println("gotówka kupca: " +buyer.cash);
       }
    }

    public abstract void refuel();
}