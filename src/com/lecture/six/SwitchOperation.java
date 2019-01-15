package com.lecture.six;

import java.util.Scanner;

public class SwitchOperation {
    public static void main(String[] args) {
        /**
         * User will insert 1 number
         * User then inserts another number
         * Then we will ask what we will do with these numbers
         * (1=adding 2=substraction 3=multiplication 4=divison)
         *
         */
        System.out.println("Welcome please write the first number");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.println("Please enter second number");
        double secondNumber = scanner.nextDouble();
        System.out.println("What to do: 1=Adding 2=Subtraction 3=multipy 4= divide");
        int operation = scanner.nextInt();

        double result=0;
        boolean isValid=false;
        switch (operation){
            case 1:
                result= firstNumber+secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                result = firstNumber /secondNumber;
                break;
            default:
                System.out.println("What is it about");
                isValid=false;
        }
        if(isValid){
            System.out.println( result);
        }











        String[] someStrings = {"Apples","Oranges"};

        String someString = someStrings[1];
        switch (someString){
            case "Apples":
                System.out.println("Apples are here");
                break;
            case "Oranges":
                System.out.println("Oranges are here");
                break;
            default:
                System.out.println("Nothing is here");
        }
    }
}
