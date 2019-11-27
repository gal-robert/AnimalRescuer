package org.fasttrackit;

public class Animal {

    String name;
    int age;
    double healthLevel;
    double hungerLevel;
    double moodLevel;
    String favoriteFood;
    String favoriteActivity;

    public void printInfo() {
        System.out.println("\nAnimal:\n   -Name: " + this.name + "\n   -Age: " + this.age + "\n   -Health level: " + this.healthLevel + "\n   -Hunger level: " + this.hungerLevel + "\n   -Mood level: " + this.moodLevel);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
