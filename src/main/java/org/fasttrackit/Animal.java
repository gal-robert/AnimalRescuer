package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private double healthLevel;
    private double hungerLevel;
    private double moodLevel;
    private String favoriteFood;
    private String favoriteActivity;
    private static int count;

    public void printInfo() {
        System.out.println(
                "\nAnimal #" + count + ":\n   -Name: " + this.name + "\n   -Age: " + this.age +
                        "\n   -Health level: " + this.healthLevel + "\n   -Hunger level: " + this.hungerLevel +
                        "\n   -Mood level: " + this.moodLevel);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(double healthLevel) {
        this.healthLevel = healthLevel;
    }

    public double getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(double hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void changeHungerLevel(double amount, String operator) {
        if (operator.equals("increment")) {
            this.hungerLevel += amount;
        } else if (operator.equals("decrement")) {
            this.hungerLevel -= amount;
        } else System.out.println("invalid operator");
    }

    public double getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(double moodLevel) {
        this.moodLevel = moodLevel;
    }

    public void changeMoodLevel(double amount, String operator) {
        if (operator.equals("increment")) {
            this.moodLevel += amount;
        } else if (operator.equals("decrement")) {
            this.moodLevel -= amount;
        } else System.out.println("invalid operator");
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public static int getCount() {
        return count;
    }
}
