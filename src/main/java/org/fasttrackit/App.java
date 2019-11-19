package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.name = "Nero";
        dog.age = 42;
        dog.favoriteActivity = "fetch";
        dog.favoriteFood = "Pedigree";
        dog.healthLevel = 7.7;
        dog.hungerLevel = 2.1;
        dog.moodLevel = 10.0;
        dog.printInfo();

        Rescuer rescuer = new Rescuer();
        rescuer.money = 1000;
        rescuer.name = "Ana";
        rescuer.prinInfo();

        AnimalFood pedigree = new AnimalFood();
        pedigree.name = "Pedigree";
        pedigree.expireDate = LocalDate.of(2020, 05, 20);
        pedigree.quantity = 20;
        pedigree.isInStock = true;
        pedigree.printInfo();

        Veterinary veterinar = new Veterinary();
        veterinar.name = "Raul";
        veterinar.specialization = "";
        veterinar.printInfo();

        Activities fetch = new Activities();
        fetch.dogName = "Nero";
        fetch.rescuer = "Ana";
        fetch.veterinarName = "Raul";

    }
}
