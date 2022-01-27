package devices;

public class Phone extends Device{

    public Double screenSize;
    public String OS;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void turnOn() {
        System.out.println("klikasz przycisk");
    }
}