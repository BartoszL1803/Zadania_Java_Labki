package devices;

public class Car {

    final String producer;
    final String model;
    public Integer yearOfProduction;
    public Double millage;
    public String color;
    public Double value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
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

    public String toString() {
        return producer +" "+ model +" "+ yearOfProduction;
    }
}