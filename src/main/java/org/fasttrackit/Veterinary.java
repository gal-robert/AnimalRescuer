package org.fasttrackit;

public class Veterinary {
    private String name;
    private String specialization;

    public Veterinary(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void printInfo() {
        System.out.println("\nVeterinary:\n   -Name: " + this.name + "\n   -Specialization: " + this.specialization);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
