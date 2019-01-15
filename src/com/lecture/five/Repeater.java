package com.lecture.five;

import java.util.Scanner;

/**
 * Objective: We want to print numbers with the amount of its value.
 * Lets suppose we enter 5: we will print:
 * 4444
 * 4
 * 4
 * 4
 * 4
 * Conditions:
 * We accept integer which is below or equal 5
 * In case of 0 give information that we got nothing to print
 * In case of negative number or any data which is not integer: print error information .
 *
 */
public class Repeater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome please enter the number");
        int incomingInt = scanner.nextInt();
        if(incomingInt==0){
            System.out.println("There is nothing to print");
        }else if(incomingInt<0){
            System.out.println("This is a negative number please provide between 1-5 (included)");
        }else if(incomingInt>5){
            System.out.println("Please enter a number between 1-5(included)");
        }else{
            //This part is responsible for 4444 one way
            String result = "";
            for(int counter=0;counter<incomingInt;counter++){
                result = result + incomingInt;
            }
            System.out.println(result);
            //This part is responsible for 4444 another way
            for(int counter=0;counter<incomingInt;counter++){
                System.out.print(incomingInt);
            }
            System.out.println();
            /*This part will print
              3
              3
              3
            * */
            for(int counter=0;counter<incomingInt;counter++){
                System.out.println(incomingInt);
            }




        }




    }
}
