package org.fasttrackit;

public class Rescuer {

    String name;
    double money;

    public Rescuer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void printInfo() {
        System.out.println("\nRescuer:\n   -Name: " + this.name + "\n   -Money: " + this.money);
    }
}
