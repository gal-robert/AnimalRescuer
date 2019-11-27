package org.fasttrackit;

public class DogActivities extends Activities {

    String activityName;
    int activityDurationInS;

    public DogActivities(Rescuer rescuer, Animal animal, String activityName, int activityDurationInM) {
        super(rescuer, animal);
        this.activityName = activityName;
        this.activityDurationInS = activityDurationInM;
    }
}
