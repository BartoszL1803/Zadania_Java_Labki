package com.company;

public class Human {

    String firstName;
    String lastName;
    Animal pet;
    Car car;
    private Double salary;

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