package com.lecture.four;

import java.util.Scanner;

public class Club {
    /**
     * In this club you ask for name
     * If name is Murat (doesnt matter if it is uppercase or lower case)
     * print "You are not allowed to go int"
     * <p>
     * <p>
     * then ask the age of the person
     * if the age is below 18
     * print "Go do your homework"
     * <p>
     * if it is above or equals 18
     * print "welcome to the club" write also the persons name
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the entrance of the Club. State your name");

        String name = scanner.next();
        if (name.equalsIgnoreCase("Murat")) {
            System.out.println("Go away you drunk");
        } else {
            System.out.println("Tell me your age?");
            int age = scanner.nextInt();
            if (age < 18) {
                System.out.println("Go do your homework");
            } else {
                System.out.println("Welcome to the Club " + name);
            }
        }
        scanner.close();
    }


}
