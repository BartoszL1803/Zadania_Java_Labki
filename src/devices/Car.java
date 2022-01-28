package devices;

import com.company.Human;
import com.company.Saleable;

public class Car extends Device implements Saleable {

    public Double millage;
    public String color;
    public Double value;
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
        if (this.forSale == true && buyer.cash >= price) {
            buyer.car = this;
            seller.car = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.toString() +" kupił od "+ seller.toString() +" samochód "+ this.toString());
        }else {
            System.out.println("ta transakcja jest nie możliwa do przeprowadzenia ze względów ekonomicznych lub etycznych!");
        }
    }
}