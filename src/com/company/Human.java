package com.company;

import creatures.Animal;
import devices.Car;
import devices.Device;
import devices.Phone;

import java.util.Arrays;
import java.util.Comparator;

public class Human {

    private static final int DEFAULT_GARAGE_SIZE = 3;
    String firstName;
    String lastName;
    public Car[] garage;
    private Double salary;
    public Double cash;
    public Phone mobile;
    public Animal animal;
    public Boolean forSale;

    Human() {
        forSale = false;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public void setCar (Car car, Integer parkingLotNumber) {
        if (this.salary > car.value) {
            System.out.println("stać cie na kupno samochodu: "+ car +", za gotówe");
            this.garage[parkingLotNumber] = car;
        }else if (this.salary > car.value/12 ) {
            System.out.println ("udało się kupić samochód: "+ car +", niestety na kredyt");
            this.garage[parkingLotNumber] = car;
        }else {
            System.out.println("nie stać cie na samochód: "+ car +", musisz poszukać lepiej płatnej pracy");
        }
    }

    public Car getCar(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
    }

    public void garageValue() {
        Double sum = 0.0;
        for(Car car : this.garage) {
            if (car == null)
                sum += 0.0;
            else
                sum += car.value;
        } System.out.println("wartość garażu: " + sum +", osoby: "+ this);
    }

    public void sortGarage() {
        Arrays.sort(garage, Comparator.nullsLast(Comparator.comparing(Device::getYearOfProduction)));
        System.out.println(Arrays.toString(garage));
    }

    public boolean hasFreeParkingLot() {
        for(int i = 0; i < garage.length; i++) {
            if(garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if(garage[i] == car) {
                return true;
            }
        }
        return false;
    }

    public double getSalary() {
        System.out.println("Twoje zarobki wynoszą: " +salary);
        return this.salary;
    }

    public void setSalary (double num) {
        if (num < 0){
            System.out.println("nie można przypisać ujemnego wynagrodzenia");
            return;
        }
        System.out.println("nowe dane zostały wysłane do systemu księgowego");
        System.out.println("musisz odebrać aneks do umowy od pani Hani z kadr");
        System.out.println("ZUS i US wiedzą o zmianie wypłaty nie ma sensu ukrywać dochodu");
        this.salary = num;
    }

    public String toString() {
        return firstName +" "+ lastName;
    }

    public int removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if(garage[i] == car) {
                return i;
            }
        }

        return 0;
    }

    public int addCar() {
        for(int i = 0; i < garage.length; i++) {
            if(garage[i] == null) {
                 return i;
            }
        }
        return 0;
    }
}