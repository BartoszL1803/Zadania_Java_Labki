package com.company;

public class Human {

    String firstName;
    String lastName;
    Animal pet;
    private Car car;
    private Double salary;

    public Car getCar() {
        return this.car;
    }

    public void setCar (Car car) {
        if (this.salary > car.value) {
            System.out.println("stać cie na kupno samochodu za gotówe");
            this.car = car;
        }else if (this.salary > car.value/12 ) {
            System.out.println ("udało się kupić samochód niestety na kredyt");
            this.car = car;
        }else {
            System.out.println("nie stać cie na samochód musisz poszukać lepiej płatnej pracy");
        }
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
}