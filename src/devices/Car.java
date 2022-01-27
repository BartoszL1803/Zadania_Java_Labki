package devices;

public class Car extends Device{

    public Double millage;
    public String color;
    public Double value;

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
}