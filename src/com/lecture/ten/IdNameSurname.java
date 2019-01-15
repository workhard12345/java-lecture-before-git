package com.lecture.ten;

import java.util.Scanner;

public class IdNameSurname {
    /**
     * We will use scanner to get name and lastname and id number
     * After we get all the values we will validate it.
     * id number will be just numbers
     * name/surname should be a unicode (Upper case lower case number)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scan.next();

        System.out.print("What is your lastname? ");
        String lastname = scan.next();

        System.out.print("What is your ID number? ");
        String idNumber = scan.next();

        if (idNumber.matches("[0-9]*")) {
            System.out.println("Id is correct");
        }else{
            System.out.println("Id is not correct");
        }

        if (name.matches("[a-zA-Z0-9]*")) {
            System.out.println("name is correct");
        }else{
            System.out.println("name is not correct");
        }

        if (lastname.matches("[a-zA-Z0-9]*")) {
            System.out.println("lastname is correct");
        }else{
            System.out.println("lastname is not correct");
        }

        if (lastname.matches("\\p{L}+")) {
            System.out.println("lastname is correct");
        }else{

        }

    }
}
