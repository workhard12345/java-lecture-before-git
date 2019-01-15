package com.lecture.thirteen;

import com.lecture.twelve.SuperMarketUtilities;

public class Account {
    double balance;
    String[] boughtItems = new String[5];
    Integer[] quantities = new Integer[5];

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String[] getBoughtItems() {
        return boughtItems;
    }

    public Integer[] getQuantities() {
        return quantities;
    }

    /**
     * This will check if the item was already bought.
     * If it is bought already increase the amount with the existing
     * quantity.
     * If it is bought the first time then insert item and put the
     * amount inside the quantity.
     * It will put the incoming item in the first empty place
     * of the arrays.
     *
     * @param incomingItem
     * @param amount
     */
    public void insertBoughtItem(String incomingItem, int amount) {
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        int indexOfItem = superMarketUtilities.getItemIndex(incomingItem, boughtItems);
        if (indexOfItem != -1) {
            //This means we have already bought this item so
            //lets increase the amount
            quantities[indexOfItem] = quantities[indexOfItem] + amount;
        } else {
            //Here we have a new item bought.
            //lets find the empty place in the boughtitems array
            int emptyIndex = superMarketUtilities.getEmptyIndex(boughtItems);
            if (emptyIndex == -1) {
                System.out.println("What the hell is going on." +
                        "We must have an empty place");
                System.exit(545);
            } else {

                boughtItems[emptyIndex] = incomingItem;
                quantities[emptyIndex] = amount;
            }
        }
    }

    public boolean deduct(double cost) {
        double threshold = .0001;
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        if (Math.abs(balance - cost) < threshold) {
            System.out.println("There is enough balance");
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        } else if (balance > cost) {
            System.out.println("There is enough balance");
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        } else {
            System.out.println("There is not enough money");
            return false;
        }
    }

    //-----------------------------------Lecture 14 ---------------------
    public void printAccountInfo() {
        for(int counter=0;counter<boughtItems.length;counter++){
            if(boughtItems[counter]!=null){
                System.out.println("Item:"+boughtItems[counter]+" quantity:"+quantities[counter]);
            }

        }
    }


}
