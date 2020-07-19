package com;

import java.util.Scanner;

public class CoffeeMachineStep4 {


    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (beans < 16) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            }
                            if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            water -= 250;
                            beans -= 16;
                            cups -= 1;
                            money += 4;
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            if (beans < 20) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            }
                            if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            cups -= 1;
                            money += 7;
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }
                            if (beans < 12) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            }
                            if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            cups -= 1;
                            money += 6;
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                            break;
                        default:
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int addWater = scanner.nextInt();
                    water += addWater;
                    System.out.println("Write how many ml of milk do you want to add:  ");
                    int addMilk = scanner.nextInt();
                    milk += addMilk;
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int addBeans = scanner.nextInt();
                    beans += addBeans;
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int addCups = scanner.nextInt();
                    cups += addCups;
                    scanner.nextLine();
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    System.out.println();
                    break;

                case "remaining":
                    display(water, milk, beans, cups, money);
                    break;

                case "exit":
                    loop = false;
                    break;

                default:
                    break;
            }
        }
    }

    private static void display(int water, int milk, int beans, int cups, int money) {
        System.out.println();
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water ");
        System.out.println(milk + " of milk ");
        System.out.println(beans + " of coffee beans ");
        System.out.println(cups + " of disposable cups ");
        System.out.println(money + " of money ");
        System.out.println();
    }
}


