package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Animal dog = new Animal("Nero", 10);
        dog.favoriteActivity = "fetch";
        dog.favoriteFood = "Pedigree";
        dog.healthLevel = 7.7;
        dog.hungerLevel = 2.1;
        dog.moodLevel = 10.0;
        dog.printInfo();

        Rescuer rescuer = new Rescuer("Alex", 1000);
        rescuer.printInfo();

        AnimalFood pedigree = new AnimalFood("Pedigree", 30);
        pedigree.expireDate = LocalDate.of(2020, 05, 20);
        pedigree.isInStock = true;
        pedigree.printInfo();

        Veterinary veterinar = new Veterinary("Joe", "Canine");
        veterinar.printInfo();

        Activities fetch = new Activities(rescuer, dog);
        fetch.veterinarName = "Raul";

    }
}
