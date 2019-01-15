package com.lecture.twelve;

import com.lecture.thirteen.Account;

import java.io.IOException;
import java.util.Scanner;

public class SuperMarket {


    public static void main(String[] args) throws IOException {
        double[] prices = new double[1];
        String[] items = new String[1];
        Scanner scanner = new Scanner(System.in);
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();

        System.out.println("Welcome to the super market. Admin please enter items and prices.");
        for (int counter=0;counter<items.length;counter++){
            //how many times this place run
            System.out.println("Please enter the new item name: ");

            String itemName = scanner.next();
            if(superMarketUtilities.getItemIndex(itemName,items)!=-1){
                System.out.println("This is duplicate item:"+itemName);
                counter--;
            }else{
                items[counter] = itemName;
                System.out.println("Please enter the price for item "+itemName);
                double itemPrice = scanner.nextDouble();
                prices[counter] = itemPrice;
            }
        }

        for (int counter=0;counter<items.length;counter++){
            System.out.println(items[counter]+" "+prices[counter]);
        }

        //-----------------------------------Lecture 13 ---------------------
        System.out.println("Please enter your budget");
        double budget = scanner.nextDouble();
        Account account = new Account(budget);
        System.out.println("Your budget is "+account.getBalance());
        //Now lets buy some items
        //If you are "done" you finish the buying

        while(true){
            System.out.println("What do you want to buy (done = finish buying)");
            String requestedItem = scanner.next();
            if(requestedItem.equalsIgnoreCase("done")){
                break;
            }

            int locatedIndex = superMarketUtilities.getItemIndex(requestedItem,items);
            if(locatedIndex==-1){
                System.out.println("This item does not exists");
            }else{
                //Now here we know item exists in the super market
                //we ask how many you want. Then we will call our method in account
                //and add that item.....
                //-----------------------------------Lecture 14 ---------------------
                System.out.println("How many of "+requestedItem+" do you want");
                int requestedQuantity = scanner.nextInt();
                //Lets check if the person has the enough money to buy the
                //product if so deduct the balance and insert the items.
                double totalCost = prices[locatedIndex]*requestedQuantity;
                totalCost = superMarketUtilities.round(totalCost);
                boolean isEnoughMoney =account.deduct(totalCost);
                if(isEnoughMoney){
                    account.insertBoughtItem(requestedItem,requestedQuantity);
                }

            }
        }
        account.printAccountInfo();




    }
}
