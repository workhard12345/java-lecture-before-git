package com.lecture.three;

public class Primitives {

    public static void main(String[] args) {
        boolean isHungry = true;
        int chickenKg = 1;
        double cost = 1.20;
        float drinkCost = 1.01f;
        char secretCode = 'C';


        short littleNumber = 3;
        long bigNumber = 1000000;

        if (isHungry) {
            System.out.println("I am hungry");
        } else {
            System.out.println("I am not hungry");
        }

        System.out.println("I ate " + chickenKg + "kg chicken.");
        System.out.println("Chicken cost: " + cost);
        System.out.println("Drink cost: "+drinkCost);

        if(cost>drinkCost){
            System.out.println("Food cost more than the drink");
        }else{
            System.out.println("(Drink cost more than the food)or is same price ");
        }

        //lets assume our secret code is D

        if(secretCode=='D'){
            System.out.println("Secret code is correct. Have fun");
        }else{
            System.out.println("Secret code is wrong. Are you Cop");
        }

        byte b = 10;
        byte c = 0x0A;
        System.out.println("Byte value "+b);
        System.out.println("Byte value "+c);


        if(littleNumber<7){
            System.out.println("Password is not strong enough");
        }else{
            System.out.println("Password is good enough");
        }

        //compare variable bigNumber with 992525

        if(bigNumber<992525){
            System.out.println("Big number is not big enough");
        }else{
            System.out.println("Big number is big enough");
        }


    }
}
