package creatures;

import com.company.Human;
import com.company.Saleable;

public abstract class Animal implements Saleable, Feedable {

    final String species;
    public Double weight;
    public String name;
    public Boolean alive;
    public Boolean forSale;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
        this.alive = true;
    }

    public void feed() {
        if (this.weight <= 0.0){
            System.out.println("N");
        }else this.weight++;
    }

    public void feed(Double foodWeight) {
        if (this.weight <= 0.0){
            System.out.println("nie możesz nakarmić martwego zwierzaka.");
        }else this.weight += foodWeight;
        System.out.println("waga twojego zwierzaka: "+ weight);
    }

    public void takeForAWalk() {
        if (this.weight <= 0.0){
            alive = false;
            System.out.println("nie możesz ciągnąć zwłok po ulicy.");
        }else this.weight--;
    }

    public String toString() {
        return species +" "+ name;
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (this.forSale == true && buyer.cash >= price) {
            buyer.animal = this;
            seller.animal = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(buyer.toString() +" kupił od "+ seller.toString() +" zwierzę "+ this.toString());
        }else {
            System.out.println("ta transakcja jest nie możliwa do przeprowadzenia ze względów ekonomicznych lub etycznych!");
        }
    }
}