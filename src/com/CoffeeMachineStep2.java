package com;

import java.util.Scanner;

public class CoffeeMachineStep2 {
    public static void main(String[] args) {
        System.out.println("Write how many ml of water the coffee machine has:  ");
        Scanner scanner = new Scanner(System.in);
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int waterMax = water / 200;
        int milkMax = milk / 50;
        int beansMax = beans / 15;
        int maxCup;

        if (waterMax < milkMax) {
            maxCup = Math.min(beansMax, waterMax);
        } else {
            maxCup = Math.min(beansMax, milkMax);
        }

        if (maxCup == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (maxCup > cups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxCup - cups) + " more than that)");
        } else {
            System.out.println("No, I can make only " + maxCup + " cup(s) of coffee");
        }
    }
}


