package com.lecture.seventeen;

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {




        RockPaperScissorsUtilities rockPaperScissorsUtilities = new RockPaperScissorsUtilities();
        Scanner scanner = new Scanner(System.in);
        String[] options = {"rock", "paper", "scissors"};

        System.out.println("Welcome to RockPaperScissors");
        System.out.println("How many rounds do you want to play?");

        int rounds = scanner.nextInt();

        System.out.println("You want to play " + rounds + " rounds.");
        System.out.println("Your options are: rock, paper, scissors and an option done");


        int won=0;
        int lost = 0;
        int tie = 0;
        int counter;

        for (counter = 0; counter < rounds; counter++) {

            int random = rockPaperScissorsUtilities.getRandomNumber(3);
            String computerInput = options[random];
            System.out.println("Enter your option:");
            String userInput = scanner.next();
            if (userInput.equalsIgnoreCase("done")) {
                break;
            } else if (userInput.equalsIgnoreCase(options[0]) || userInput.equalsIgnoreCase(options[1]) ||
                    userInput.equalsIgnoreCase(options[2])) { //checking if the string is in the array
                if (userInput.equalsIgnoreCase(computerInput)) {
                    System.out.println("It's a tie, computer also chose " + computerInput);
                    tie++;
                } else if (
                        (userInput.equalsIgnoreCase(options[0]) && computerInput.equalsIgnoreCase(options[2]))

                                || (userInput.equalsIgnoreCase(options[1]) && computerInput.equalsIgnoreCase(options[0]))

                                || (userInput.equalsIgnoreCase(options[2]) && computerInput.equalsIgnoreCase(options[1]))) {
                    System.out.println("You won, computer chose " + computerInput);
                    won++;
                } else {
                    System.out.println("you lost, computer chose " + computerInput);
                    lost++;

                }

            } else {
                System.out.println("choose an option which was given before.");
                counter--;
            }


        }
        System.out.println("You played " + counter + " rounds");
        System.out.println("You won " + won + " games, lost " + lost + " games, ties " + tie + " games.");
    }

}