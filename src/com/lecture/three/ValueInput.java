package com.lecture.three;

import java.util.Scanner;

public class ValueInput {

    public static void main(String[] args) {
        boolean isHungry;
        int chickenKg;
        double cost;
        float drinkCost;
        char secretCode;

        short littleNumber;
        long bigNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter data for isHungry (boolean)");
        isHungry = scanner.nextBoolean();
        if (isHungry) {
            System.out.println("I am hungry");
        } else {
            System.out.println("I am not hungry");
        }

        System.out.println("Give me the chicken kg (int)");
        chickenKg= scanner.nextInt();
        System.out.println("I ate " + chickenKg + "kg chicken.");

        System.out.println("Give me the cost of the chicken (double)");
        cost = scanner.nextDouble();
        System.out.println("Chicken cost: " + cost);

        System.out.println("Give me the cost of the drink (float)");
        drinkCost = scanner.nextFloat();
        System.out.println("Drink cost: "+drinkCost);

        if(cost>drinkCost){
            System.out.println("Food cost more than the drink");
        }else{
            System.out.println("(Drink cost more than the food)or is same price ");
        }

        System.out.println("What is the secret Code Bro! (char)");
        secretCode = scanner.next().charAt(0);
        if(secretCode=='D'){
            System.out.println("Secret code is correct. Have fun");
        }else{
            System.out.println("Secret code is wrong. Are you Cop");
        }

        System.out.println("Give me some little information (short)");
        littleNumber = scanner.nextShort();
        if(littleNumber<7){
            System.out.println("Password is not strong enough");
        }else{
            System.out.println("Password is good enough");
        }

        System.out.println("Give me some big number information (long)");
        bigNumber = scanner.nextLong();
        if(bigNumber<992525){
            System.out.println("Big number is not big enough");
        }else{
            System.out.println("Big number is big enough");
        }



    }

}
