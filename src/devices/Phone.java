package devices;

import com.company.Human;
import com.company.Saleable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device implements Saleable {

    private static final String DEFAULT_VERSION_NAME = "1.0";
    private static final String DEFAULT_SERVER_NAME = "apps.wsb.pl";
    private static final String DEFAULT_PROTOCOL_NAME = "https";
    public Double screenSize;
    public String OS;
    public Boolean forSale;
    public Set<Application> listOfApp = new HashSet<Application>();

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
            System.out.println(buyer.toString() + " kupił od " + seller.toString() + " telefon " + this.toString());
        } else {
            System.out.println("ta transakcja jest nie możliwa do przeprowadzenia ze względów ekonomicznych lub etycznych!");
        }
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_VERSION_NAME);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }

    public void installAnApp(String appName, String version, String server) {
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
            System.out.println("instaluje apklikacje: " + url.getFile() + ", z serwera: " + url);
        }

        public void buyAndInstall(Human human, Application app) {
            if (human.cash > app.price) {
                System.out.println("użytkownik " + human + " zakupił i zainstalował aplikacje " + app.name + " w telefonie " + this);
                this.listOfApp.add(app);
                human.cash -= app.price;
            } else {
                System.out.println("nie stać cie na tą apke");
            }
        }

        public void checkApp(Application application) {
            if (listOfApp.contains(application)) {
                System.out.println("aplikacja: "+ application.name + " jest zainstalowana na " + this);
            } else {
                System.out.println("telefon " + this + " nie ma zainstalowanej takiej aplikacji");
            }
        }

    public void checkAppWithName(String appName) {
        for (Application application : this.listOfApp) {
            if (application.name.matches(appName)) {
                System.out.println("aplikacja: " + application.name + " jest zainstalowana na urządzeniu: " + this);
                return;
            }
        } System.out.println("aplikacja: "+ appName +" nie jest zainstalowana na urządzeniu: " + this);
    }


    public void showFreeApp () {
            for (Application application : this.listOfApp) {
                if (application.price == 0.0) {
                    System.out.println(application);
                }
            }
        }

        public void installedAppValue () {
            Double sum = 0.0;
            for (Application application : this.listOfApp) {
                sum += application.price;
            }
            System.out.println("wartość zainstalowanych aplikacji na telefonie: " + this + " wynosi: " + sum);
        }

        public void showAppAlphabetically () {
            Application[] x = listOfApp.toArray(new Application[listOfApp.size()]);
            Arrays.sort(x, Comparator.comparing(Application::getAppName));
            System.out.println(Arrays.toString(x));
        }

        public void showAppPriceAsc () {
            Application[] x = listOfApp.toArray(new Application[listOfApp.size()]);
            Arrays.sort(x, Comparator.comparing(Application::getAppPrice));
            System.out.println(Arrays.toString(x));
        }
}