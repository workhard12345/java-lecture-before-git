package com.lecture.six;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vegetables = {"Carrot","Potato","Onion","Garlic","Eggplant"};
        String[] fruits = {"Banana","Orange","Grape","Apple","Kiwi","Pineapple"};

        String[] customerList = new String[7];
        System.out.println("Please enter vegetable or fruit");
        System.out.println("Vegetables=>"+Arrays.toString(vegetables));
        System.out.println("Fruits=>"+Arrays.toString(fruits));
        System.out.println();

        //new coder way.
       /* customerList[0] = scanner.next();
        customerList[1] = scanner.next();
        customerList[2] = scanner.next();
        customerList[3] = scanner.next();
        customerList[4] = scanner.next();
        customerList[5] = scanner.next();
        customerList[6] = scanner.next();*/
        //old coder way
        for(int counter=0;counter<customerList.length;counter++){
            customerList[counter] = scanner.next();
        }
        //Find out the amount of vegetables.
        int vegetableAmount=0;
        int fruitAmount=0;


        /**
         * First for is responsible for the customer Item loop
         * Meaning first we get the first item of the customer
         * then we check if it is a member of fruit or vegetable
         * array.
         */

        for(String customerItem: customerList){
            System.out.println("Deciding "+customerItem+" if fruit or vegetable");
            //This one will decide if it is vegetable
            // String[] vegetables = {"Carrot","Potato","Onion","Garlic","Eggplant"};
            for(int counter=0;counter<vegetables.length;counter++){
                //If the customer item is part of the array
                if(customerItem.equals(vegetables[counter])){
                    vegetableAmount++; //vegetableAmount = vegetableAmount +1;
                    System.out.println(customerItem+" is a vegetable");
                    break;
                }
            }
            //This part is responsible for fruit checking.
            //  String[] fruits = {"Banana","Orange","Grape","Apple","Kiwi","Pineapple"};
            for(int counter=0;counter<fruits.length;counter++){
                //If the customer item is part of the array
                if(customerItem.equals(fruits[counter])){
                    fruitAmount++; //fruitAmount = fruitAmount +1;
                    System.out.println(customerItem+" is a fruit");
                    break;
                }
            }
//66(++++) 64(**) 67
        }

        if( (vegetableAmount+fruitAmount)!=7){
            System.out.println("In the array list there is unknown information (neither fruit or vegetable");
        }else{
            System.out.println("Total vegetable amount "+vegetableAmount);
            System.out.println("Total fruit amount "+fruitAmount);
        }












        /**
         * int[] arrayOfInts = new int[5];
         * // initialization
         * arrayOfInts[0] = 10;
         * arrayOfInts[1] = 15;
         * arrayOfInts[2] = 20;
         * arrayOfInts[3] = 25;
         * arrayOfInts[4] = 30;
         */
        /**
         * Task one create an array worth of 7 values;
         * Fruits:(Banana, Orange, Grape, Apple, Kiwi, Pineapple)
         * Vegetable:(Carrot, Potato, Onion, Garlic, Eggplant)
         * //
         */
        /**
         *  User will
         */


    }
}
