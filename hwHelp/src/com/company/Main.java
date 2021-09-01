package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float neededAmount;
        float epsilon = 0.000001f;

        Notes twenties = new Notes(20);
        Notes tens = new Notes(10);
        Notes fives = new Notes(5);
        Notes ones = new Notes(1);

        Coins quarters = new Coins(0.25f,0.2f);
        Coins dimes = new Coins(0.10f,0.08f);
        Coins nickels = new Coins(0.05f,0.176f);
        Coins pennies = new Coins(0.01f,0.088f);

        dimes.increaseQuantity(41);
        nickels.increaseQuantity(17);
        pennies.increaseQuantity(132);
        ones.increaseQuantity(33);
        fives.increaseQuantity(12);
        tens.increaseQuantity(2);
        twenties.increaseQuantity(5);

        System.out.println(twenties);
        System.out.println(tens);
        System.out.println(fives);
        System.out.println(ones);
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);
        System.out.println(pennies);

        float sumValue = (twenties.getTotalValue() + tens.getTotalValue() + fives.getTotalValue() + ones.getTotalValue() + quarters.getTotalValue() + dimes.getTotalValue() + nickels.getTotalValue() + pennies.getTotalValue());
        float sumWeight = (quarters.getTotalWeight() + dimes.getTotalWeight() + nickels.getTotalWeight() + pennies.getTotalWeight());
        float totalValue = (float) Math.round(sumValue * 100) / 100;

        System.out.println("Total money is " + totalValue + " total weight is " + sumWeight + "oz");
        System.out.println("How much do you need?");
        neededAmount = scan.nextFloat();

        int twentiesAmount = twenties.getQuantityOnHand();
        int tensAmount = tens.getQuantityOnHand();
        int fivesAmount = fives.getQuantityOnHand();
        int onesAmount = ones.getQuantityOnHand();

        int quartersAmount = quarters.getQuantityOnHand();
        int dimesAmount = dimes.getQuantityOnHand();
        int nickelsAmount = nickels.getQuantityOnHand();
        int penniesAmount = pennies.getQuantityOnHand();

        while (neededAmount >= 20 && twentiesAmount > 0) {
            totalValue -= 20;
            neededAmount -= 20;
            twentiesAmount--;
            System.out.println("Give them a $20 note");
        }
        while (neededAmount >= 10 && tensAmount > 0) {
            totalValue -= 10;
            neededAmount -= 10;
            tensAmount--;
            System.out.println("Give them a $10 note");
        }
        while (neededAmount >= 5 && fivesAmount > 0) {
            totalValue -= 5;
            neededAmount -= 5;
            fivesAmount--;
            System.out.println("Give them a $5 note");
        }
        while (neededAmount >= 1 && onesAmount > 0) {
            totalValue -= 1;
            neededAmount -= 1;
            onesAmount--;
            System.out.println("Give them a $1 note");
        }
        while (neededAmount >= 0.25 && quartersAmount > 0) {
            totalValue -= 0.25;
            neededAmount -= 0.25;
            sumWeight -= 0.2f;
            quartersAmount--;
            System.out.println("Give them a quarter");
        }
        while (neededAmount >= 0.10 && dimesAmount > 0) {
            totalValue -= 0.10;
            neededAmount -= 0.10;
            sumWeight -= 0.08;
            dimesAmount--;
            System.out.println("Give them a dime");
        }
        while (neededAmount >= 0.05 && nickelsAmount > 0) {
            totalValue -= 0.05;
            neededAmount -= 0.05;
            sumWeight -= 0.176;
            nickelsAmount--;
            System.out.println("Give them a nickel");
        }
        while (neededAmount >= 0.01 && penniesAmount > 0) {
            totalValue -= 0.01;
            neededAmount -= 0.01;
            sumWeight -= 0.088;
            penniesAmount--;
            System.out.println("Give them a penny");
        }

        if (totalValue >= 0.001 && neededAmount < epsilon)
            System.out.println("I have $" + totalValue + " left, its total weight is " + sumWeight + "oz");
        else
            System.out.println("I don't have enough money. I still owe you $" + neededAmount);
    }


}
