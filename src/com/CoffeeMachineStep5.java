package com;

import java.util.Scanner;

public class CoffeeMachineStep5 {
    enum State {
        MENU, FILL_WATER, FILL_MILK, FILL_BEANS, FILL_CUPS, BUY, EXIT
    }

    // Field, Champ, Attributs
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;
    private State state;

    // Création constructeur
    public CoffeeMachineStep5(int water, int milk, int beans, int cups, int money) {
        // Initialisation des champs / attributs
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
        this.state = State.MENU;
    }

    public void displayNextAction() {
        switch (state) {
            case MENU:
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                break;
            case BUY:
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                break;
            case FILL_WATER:
                System.out.println("Write how many ml of water do you want to add: ");
                break;
            case FILL_MILK:
                System.out.println("Write how many ml of milk do you want to add:  ");
                break;
            case FILL_BEANS:
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                break;
            case FILL_CUPS:
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                break;
        }
    }

    public void process(String userInput) {
        switch (state) {
            case MENU:
                processMenu(userInput);
                break;
            case BUY:
                processBuy(userInput);
                break;
            case FILL_WATER:
                this.water += Integer.parseInt(userInput);
                this.state = State.FILL_MILK;
                break;
            case FILL_MILK:
                this.milk += Integer.parseInt(userInput);
                this.state = State.FILL_BEANS;
                break;
            case FILL_BEANS:
                this.beans += Integer.parseInt(userInput);
                this.state = State.FILL_CUPS;
                break;
            case FILL_CUPS:
                this.cups += Integer.parseInt(userInput);
                this.state = State.MENU;
                break;
        }
    }

    private void processMenu(String userInput) {
        switch (userInput) {
            case "buy":
                this.state = State.BUY;
                break;
            case "take":
                processTake();
                break;
            case "remaining":
                processRemaining();
                break;
            case "fill":
                this.state = State.FILL_WATER;
                break;
            case "exit":
                this.state = State.EXIT;
                break;

        }
    }

    private void processTake() {
        System.out.println("I gave you $" + money);
        this.money = 0;
        System.out.println();
    }

    private void processRemaining() {
        System.out.println();
        System.out.println("The coffee machine has: ");
        System.out.println(this.water + " of water ");
        System.out.println(this.milk + " of milk ");
        System.out.println(this.beans + " of coffee beans ");
        System.out.println(this.cups + " of disposable cups ");
        System.out.println(this.money + " of money ");
        System.out.println();
    }

    private void processBuy(String userInput) {
        switch (userInput) {
            case "1":
                buyCafe(250, 0, 16, 4);
                this.state = State.MENU;
                break;
            case "2":
                buyCafe(350, 75, 20, 7);
                this.state = State.MENU;
                break;
            case "3":
                buyCafe(200, 100, 12, 6);
                this.state = State.MENU;
                break;
            case "back":
                this.state = State.MENU;
                break;
        }
    }

    private void buyCafe(int waterNeeded, int milkNeeded, int beansNeeded, int moneyGained) {
        int cupsNeeded = 1;

        if (this.water < waterNeeded) {
            System.out.println("Sorry, not enough water!");
            return;
        }

        if (this.milk < milkNeeded) {
            System.out.println("Sorry, not enough milk!");
            return;
        }

        if (this.beans < beansNeeded) {
            System.out.println("Sorry, not enough beans!");
            return;
        }

        if (this.cups < cupsNeeded) {
            System.out.println("Sorry, not enough cups!");
            return;
        }

        this.water -= waterNeeded;
        this.milk -= milkNeeded;
        this.beans -= beansNeeded;
        this.cups -= cupsNeeded;
        this.money += moneyGained;

        System.out.println("I have enough resources, making you a coffee!");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Création d'une instance en utilisant constructeur
        CoffeeMachineStep5 coffeeMachine = new CoffeeMachineStep5(400, 540, 120, 9, 550);
        while (coffeeMachine.state != State.EXIT) {
            coffeeMachine.displayNextAction();
            String userInput = scanner.nextLine();
            coffeeMachine.process(userInput);
        }
    }
}

