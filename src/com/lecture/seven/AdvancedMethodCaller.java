package com.lecture.seven;

import java.util.Scanner;

public class AdvancedMethodCaller {
    /**/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedWelcomeUtilities advancedWelcomeUtilities = new AdvancedWelcomeUtilities();
        System.out.println("Welcome write your name");
        String name = scanner.next();
        String surname="";
        if(scanner.hasNext())
        {
            surname=scanner.next();
        }

        System.out.println("Welcome write your surname");

        advancedWelcomeUtilities.setName(name);
        advancedWelcomeUtilities.setSurname(surname);
        //advancedWelcomeUtilities.setNameAndSurname(name,surname);
        advancedWelcomeUtilities.printNameAndSurname();



    }
}
