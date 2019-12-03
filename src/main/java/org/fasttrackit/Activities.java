package org.fasttrackit;

public class Activities {
    private Rescuer rescuer;
    private Animal animal;
    private String activityName;

    public Activities(Rescuer rescuer, Animal animal, String activityName) {
        this.rescuer = rescuer;
        this.animal = animal;
        this.activityName = activityName;
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
}
