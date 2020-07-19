package com;

import java.util.Scanner;

public class CoffeeMachineStep3 {
    public static void isBuy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                water -= 250;
                beans -= 16;
                cups -= 1;
                money += 4;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                beans -= 20;
                cups -= 1;
                money += 7;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                beans -= 12;
                cups -= 1;
                money += 6;
                break;
            default:
                break;
        }
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water ");
        System.out.println(milk + " of milk ");
        System.out.println(beans + " of coffee beans ");
        System.out.println(cups + " of disposable cups ");
        System.out.println(money + " of money ");
    }


    public static void isFill() {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:  ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int addCups = scanner.nextInt();


        System.out.println("The coffee machine has: ");
        System.out.println(water + addWater + " of water ");
        System.out.println(milk + addMilk + " of milk ");
        System.out.println(beans + addBeans + " of coffee beans ");
        System.out.println(cups + addCups + " of disposable cups ");
        System.out.println(money + " of money ");
    }

    public static void isTake() {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        System.out.println("I gave you $" + money);
        System.out.println();
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water ");
        System.out.println(milk + " of milk ");
        System.out.println(beans + " of coffee beans ");
        System.out.println(cups + " of disposable cups ");
        System.out.println("0 of money ");

    }

    public static void main(String[] args) {
        System.out.println("The coffee machine has: ");
        System.out.println("400 of water ");
        System.out.println("540 of milk ");
        System.out.println("120 of coffee beans ");
        System.out.println("9 of disposable cups ");
        System.out.println("550 of money ");

        System.out.println();
        System.out.println("Write action (buy, fill, take): ");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action) {
            case "buy":
                isBuy();
                break;
            case "fill":
                isFill();
                break;
            case "take":
                isTake();
                break;
            default:
                break;
        }
    }
}
