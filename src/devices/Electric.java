package devices;

public class Electric extends Car {

    public Electric(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void refuel() {
        System.out.println("naładowałeś elektryka, cieszę się że dbasz oo planete :)");
    }
}