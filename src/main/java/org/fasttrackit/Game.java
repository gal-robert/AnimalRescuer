package org.fasttrackit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    List<Animal> animals = new ArrayList<>();
    EntertainmentActivity[] activities = new EntertainmentActivity[2];
    List<AnimalFood> foods = new ArrayList<>();

    Rescuer player = initializeRescuer();

    public void start() {
        initalizeAnimal();
        createActivity();
        createFood();

        //noinspection InfiniteLoopStatement
        while (true) interact();
    }

    private void interact() {
        System.out.println("\nWhat do you want to do?");
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();

        if (command.equals("activity")) {
            doActivity();
        } else if (command.equals("feed")) {
            feed();
        } else if (command.contains("show")) {
            if (command.contains("food")) {
                for (int i = 0; i < foods.size(); i++) {
                    System.out.println((i + 1) + ". " + foods.get(i).getName());
                }
            } else if (command.contains("activities")) {
                for (int i = 0; i < activities.length; i++) {
                    System.out.println((i + 1) + ". " + activities[i].getActivityName());
                }
            } else {
                System.out.println("Commands you can use:\n   show activities\n   show food");
            }
        } else if (command.equals("exit") || command.equals("quit")) {
            System.exit(0);
        }

    }

    private void feed() {
        System.out.print("Food name: ");
        Scanner foodScanner = new Scanner(System.in);

        if (foodScanner.nextLine().equals("pedigree")) {
            player.feed(animals.get(0), foods.get(0));
        }
    }

    private void doActivity() {
        System.out.print("Activity name: ");
        Scanner nameScanner = new Scanner(System.in);

        if (nameScanner.nextLine().equals("fetch")) {
            player.game(animals.get(0), (EntertainmentActivity) activities[0]);
        }

    }

    private void createActivity() {
        Activities fetch = new EntertainmentActivity(player, animals.get(0), "fetch", 30);
        Activities walk = new EntertainmentActivity(player, animals.get(0), "walk", 50);

        activities[0] = (EntertainmentActivity) fetch;
        activities[1] = (EntertainmentActivity) walk;
    }

    private void createFood() {
        AnimalFood pedigree = new AnimalFood("Pedigree", 30, 3);
        pedigree.setExpireDate(LocalDate.now().plusMonths(5));

        AnimalFood whyskas = new AnimalFood("Whyskas", 11, 5);
        whyskas.setExpireDate(LocalDate.now().plusMonths(4));

        foods.add(pedigree);
        foods.add(whyskas);
    }

    private Rescuer initializeRescuer() {
        System.out.print("Please enter your name: ");
        Scanner name = new Scanner(System.in);
        String nameInput = name.nextLine();
        System.out.print("Please enter the amount of money you start with: ");
        Scanner money = new Scanner(System.in);
        int moneyInput = money.nextInt();

        Rescuer rescuer = new Rescuer(nameInput, moneyInput);
        return rescuer;
    }


    private void initalizeAnimal() {
        System.out.println("What type of animal you want?");
        Scanner type = new Scanner(System.in);
        if (type.nextLine().equals("dog")) {
            Animal dog = new Dog("", 0, "");
            System.out.print("Please enter the name: ");
            Scanner name = new Scanner(System.in);
            dog.setName(name.nextLine());

            System.out.print("Please enter the age: ");
            Scanner age = new Scanner(System.in);
            dog.setAge(name.nextInt());

            System.out.print("Please enter the breed: ");
            Scanner breed = new Scanner(System.in);
            ((Dog) dog).setBreed(breed.nextLine());

            System.out.print("Please enter the favorite food: ");
            Scanner favoriteFood = new Scanner(System.in);
            dog.setFavoriteFood(favoriteFood.nextLine());

            System.out.print("Please enter the favorite activity: ");
            Scanner favoriteActivity = new Scanner(System.in);
            dog.setFavoriteActivity(favoriteActivity.nextLine());

            animals.add(dog);

        } else {
            Animal animal = new Animal("", 0);
            System.out.print("Please enter the name: ");
            Scanner name = new Scanner(System.in);
            animal.setName(name.nextLine());

            System.out.print("Please enter the age: ");
            Scanner age = new Scanner(System.in);
            animal.setAge(name.nextInt());

            System.out.print("Please enter the favorite food: ");
            Scanner favoriteFood = new Scanner(System.in);
            animal.setFavoriteFood(favoriteFood.nextLine());

            System.out.print("Please enter the favorite acticity: ");
            Scanner favoriteActivity = new Scanner(System.in);
            animal.setFavoriteActivity(favoriteActivity.nextLine());

            animals.add(animal);
        }
    }
}
