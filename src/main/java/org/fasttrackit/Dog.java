package org.fasttrackit;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void mood() {
        if (getMoodLevel() >= 7) {
            System.out.println(getName() + " is happy af *wiggles tail*");
        } else if (getMoodLevel() >= 4 && getMoodLevel() < 7) {
            System.out.println(getName() + " is feeling alright");
        } else if (getMoodLevel() >= 0 && getMoodLevel() < 4) {
            System.out.println(getName() + " is feeling bad *sad puppy eyes*");
        }
    }
}
