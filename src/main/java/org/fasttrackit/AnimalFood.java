package org.fasttrackit;

//import java.util.Date;

import java.time.LocalDate;

public class AnimalFood {
    private String name;
    private double quantity;
    private LocalDate expireDate;
    private boolean isInStock;
    private int saturation;

    public void printInfo() {
        System.out.println("\nFood:\n   -Name: " + this.name + "\n   -Quantity: " + this.quantity + "\n   -Expire Date: " + this.expireDate + "\n   -Available: " + this.isInStock);
    }

    public AnimalFood(String name, double quantity, int saturation) {
        this.name = name;
        this.quantity = quantity;
        this.saturation = saturation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public int getSaturation() {
        return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }
}
