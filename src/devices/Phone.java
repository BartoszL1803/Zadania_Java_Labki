package devices;

import com.company.Human;
import com.company.Saleable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Saleable {

    private static final String DEFAULT_VERSION_NAME = "1.0";
    private static final String DEFAULT_SERVER_NAME = "apps.wsb.pl";
    private static final String DEFAULT_PROTOCOL_NAME = "https";
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

    public void installAnApp(String appName) {
        this.installAnApp(appName,DEFAULT_VERSION_NAME);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName,version,DEFAULT_SERVER_NAME);
    }

    public void installAnApp(String appName,String version, String server) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL_NAME, server, 443, appName + "-" + version);
            this.installAnApp(url);

        } catch (MalformedURLException e) {
            System.out.println("nie ma takiego adresu");
            e.printStackTrace();
        }
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(URL url) {
        System.out.println("instaluje apklikacje: " + url.getFile() + ", z serwera: "+url);
    }
}