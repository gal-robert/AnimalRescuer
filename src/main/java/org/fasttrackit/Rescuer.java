package org.fasttrackit;

public class Rescuer {

    private String name;
    private double money;

    public Rescuer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void printInfo() {
        System.out.println("\nRescuer:\n   -Name: " + this.name + "\n   -Money: " + this.money);
    }

    public void feed(Animal animal, AnimalFood food) {
        System.out.println("\n" + this.name + " just gave " + animal.getName() + " some " + food.getName());

        int saturation = food.getSaturation();

        if (food.getName().equals(animal.getFavoriteFood())) {
            saturation += 2;
            animal.changeHungerLevel(1, "decrement");
        }
        if (animal.getHungerLevel() - saturation < 0) {
            animal.setHungerLevel(0);
        } else {
            animal.changeHungerLevel(saturation, "decrement");
        }

        System.out.println("Current hunger level: " + animal.getHungerLevel());
        System.out.println("Current mood level: " + animal.getMoodLevel());
    }

    public void entertainment(Animal animal, Game game) {

        System.out.println(
                "\n" + this.name + " just played " + game.getActivityName() + " with " +
                        animal.getName() + " for " + game.getActivityDurationInM() + " minutes"
        );

        if (animal.getMoodLevel() + 5 > 10) {
            animal.setMoodLevel(10);
        } else {
            animal.changeMoodLevel(5, "increment");
        }

        System.out.println("Current mood level: " + animal.getMoodLevel());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
