package org.fasttrackit;

public class Activities {
    String rescuer;
    String dogName;
    String veterinarName;

    public Activities(Rescuer rescuer, Animal animal) {
        this.rescuer = rescuer.name;
        this.dogName = animal.name;
    }
}
