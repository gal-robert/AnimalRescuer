package org.fasttrackit;

public class Game extends Activities {

    private String activityName;
    private int activityDurationInM;

    public Game(Rescuer rescuer, Animal animal, String activityName, int activityDurationInM) {
        super(rescuer, animal, activityName);
        this.activityName = activityName;
        this.activityDurationInM = activityDurationInM;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public int getActivityDurationInM() {
        return activityDurationInM;
    }

    public void setActivityDurationInM(int activityDurationInM) {
        this.activityDurationInM = activityDurationInM;
    }
}
