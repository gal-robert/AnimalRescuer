package org.fasttrackit;

public class DogActivities extends Activities {

    String activityName;
    int activityDurationInS;

    public DogActivities(Rescuer rescuer, Animal animal, String activityName, int activityDurationInM) {
        super(rescuer, animal);
        this.activityName = activityName;
        this.activityDurationInS = activityDurationInM;
    }

    public void doActivity() {
        System.out.println("\n" +
                rescuer + " just played " + activityName + " with " + animalName + " for " + activityDurationInS + " minutes"
        );

        if (moodLevel + 5 > 10) {
            moodLevel = 10;
        } else {
            moodLevel += 5;
        }

        System.out.println("Current mood level: " + moodLevel);
    }
}
