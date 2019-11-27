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

    public void feed(Animal animal, AnimalFood food) {
        String animalName = animal.name;
        String foodName = food.name;
        double saturation = 3;

        System.out.println("\n" + this.name + " just gave " + animalName + " some " + foodName);

        if (foodName == animal.favoriteFood) {
            saturation += 2;
        }

        if (animal.hungerLevel - saturation < 0) {
            animal.hungerLevel = 0;
        } else {
            animal.hungerLevel -= saturation;
        }

        System.out.println("Current hunger level: " + animal.hungerLevel);
    }
}
