package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Animal cat = new Animal("Princess", 10);
        cat.favoriteFood = "mice";
        cat.printInfo();

        Dog dog = new Dog("Rufus", 2, "Akita");
        dog.hungerLevel = 5.2;
        dog.moodLevel = 5.0;
        dog.favoriteFood = "Pedigree";
        dog.printInfo();

        Rescuer rescuer = new Rescuer("Alex", 1000);
        rescuer.printInfo();

        AnimalFood pedigree = new AnimalFood("Pedigree", 30);
        pedigree.expireDate = LocalDate.of(2020, 05, 20);
        pedigree.isInStock = true;
        pedigree.printInfo();

        Veterinary veterinar = new Veterinary("Joe", "Canine");
        veterinar.printInfo();

        Activities walk = new Activities(rescuer, dog);

        DogActivities fetch = new DogActivities(rescuer, dog, "fetch", 30);
        fetch.doActivity();

        rescuer.feed(dog, pedigree);

    }
}
