package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Animal cat = new Animal("Princess", 10);
        cat.favoriteActivity = "running away from dogs";
        cat.favoriteFood = "mice";
        cat.healthLevel = 7.7;
        cat.hungerLevel = 2.1;
        cat.moodLevel = 10.0;
        cat.printInfo();

        Dog dog = new Dog("Rufus", 2, "Akita");

        Rescuer rescuer = new Rescuer("Alex", 1000);
        rescuer.printInfo();

        AnimalFood pedigree = new AnimalFood("Pedigree", 30);
        pedigree.expireDate = LocalDate.of(2020, 05, 20);
        pedigree.isInStock = true;
        pedigree.printInfo();

        Veterinary veterinar = new Veterinary("Joe", "Canine");
        veterinar.printInfo();

        Activities fetch = new Activities(rescuer, dog);

        DogActivities walking = new DogActivities(rescuer, dog, "Walking", 60);

    }
}
