package com.lecture.seven;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class IntroductionToMethods {

    /**
     * Every method has one purpose.
     */
     public void welcomeUser(String[] vegetables,String[] fruits){
         System.out.println("Please enter vegetable or fruit");
         System.out.println("Vegetables=>"+Arrays.toString(vegetables));
         System.out.println("Fruits=>"+Arrays.toString(fruits));
         System.out.println();
     }

    /**
     * This method will decide if this is vegetable
     * userItem => user input
     * vegetables => array of the vegetables
     * @return
     */
     public boolean isThisVegetable(String userItem, String[] vegetables){
         for(int counter=0;counter<vegetables.length;counter++){
             //If the customer item is part of the array
             if(userItem.equals(vegetables[counter])){
                 System.out.println(userItem+" is a vegetable");
                 return true;
             }
         }
         return false;
     }
    /**
     * This method will decide if this is fruit
     * userItem => user input
     * fruits => array of fruits
     *
     */
    public boolean isThisFruit(String userItem,String[] fruits){
        for(String fruitItem:fruits){
            if(userItem.equals(fruitItem)){
                System.out.println(userItem+" is a fruit");
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String[] vegetables = {"Carrot","Potato","Onion","Garlic","Eggplant"};
        String[] fruits = {"Banana","Orange","Grape","Apple","Kiwi","Pineapple"};

        String[] customerList = new String[7];
        IntroductionToMethods introductionToMethods = new IntroductionToMethods();
        introductionToMethods.welcomeUser(vegetables,fruits);

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
            boolean isThisVegetable = introductionToMethods.isThisVegetable(customerItem,vegetables);
            boolean isThisFruit = introductionToMethods.isThisFruit(customerItem,fruits);
            if(isThisVegetable){
                vegetableAmount++;
            }else if(isThisFruit){
                fruitAmount++;
            }else{
                System.out.println("What is this!!??!?!? "+customerItem);
                System.exit(1);
            }
        }
        System.out.println("Total vegetable amount "+vegetableAmount);
        System.out.println("Total fruit amount "+fruitAmount);

    }
}
