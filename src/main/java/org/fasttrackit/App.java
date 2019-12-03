package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Animal cat = new Animal("Princess", 10);
        cat.setFavoriteFood("mice");
        cat.printInfo();

        Dog dog = new Dog("Rufus", 2, "Akita");
        dog.setHungerLevel(5.2);
        dog.setMoodLevel(5.0);
        dog.setHealthLevel(10);
        dog.setFavoriteFood("Pedigree");
        dog.setFavoriteActivity("fetch");
        dog.printInfo();

        Rescuer rescuer = new Rescuer("Alex", 1000);
        rescuer.printInfo();

        AnimalFood pedigree = new AnimalFood("Pedigree", 30, 3);
        pedigree.setExpireDate(LocalDate.of(2020, 5, 20));
        pedigree.printInfo();

        Veterinary veterinar = new Veterinary("Joe", "Canine");
        veterinar.printInfo();

        Activities walk = new Activities(rescuer, dog, "walking");

        Game fetch = new Game(rescuer, dog, "fetch", 30);
        rescuer.game(dog, fetch);

        rescuer.feed(dog, pedigree);

        dog.mood();

    }
}
