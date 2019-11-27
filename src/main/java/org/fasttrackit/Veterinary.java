package org.fasttrackit;

public class Veterinary {
    String name;
    String specialization;

    public Veterinary(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void printInfo() {
        System.out.println("\nVeterinary:\n   -Name: " + this.name + "\n   -Specialization: " + this.specialization);
    }
}
