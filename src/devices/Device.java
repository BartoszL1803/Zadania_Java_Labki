package devices;

public abstract class Device {
    final String producer;
    final String model;
    final Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return producer +" "+ model +" "+ yearOfProduction;
    }

    abstract void turnOn();
}