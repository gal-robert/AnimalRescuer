package org.fasttrackit;

//import java.util.Date;

import java.time.LocalDate;

public class AnimalFood {
    String name;
    double quantity;
    LocalDate expireDate;
    boolean isInStock;

    public void printInfo() {
        System.out.println("\nFood:\n   -Name: " + this.name + "\n   -Quantity: " + this.quantity + "\n   -Expire Date: " + this.expireDate + "\n   -Available: " + this.isInStock);
    }

    public AnimalFood(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
