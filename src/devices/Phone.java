package devices;

import com.company.Human;
import com.company.Saleable;

public class Phone extends Device implements Saleable {

    public Double screenSize;
    public String OS;
    public Boolean forSale;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void turnOn() {
        System.out.println("klikasz przycisk");
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (this.forSale == true && buyer.cash >= price) {
            buyer.mobile = this;
            seller.mobile = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.toString() +" kupił od "+ seller.toString() +" telefon "+ this.toString());
        }else {
            System.out.println("ta transakcja jest nie możliwa do przeprowadzenia ze względów ekonomicznych lub etycznych!");
        }
    }
}