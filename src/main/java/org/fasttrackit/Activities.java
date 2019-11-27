package org.fasttrackit;

public class Activities {
    String rescuer;
    String animalName;
    String veterinarName;
    double moodLevel;

    public Activities(Rescuer rescuer, Animal animal) {
        this.rescuer = rescuer.name;
        this.animalName = animal.name;
        this.moodLevel = animal.moodLevel;
    }
}
