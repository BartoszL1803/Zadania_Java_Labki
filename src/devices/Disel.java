package devices;

public class Disel extends Car {

    public Disel(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void refuel() {
        System.out.println("niemiec płakał jak tankował");
    }
}