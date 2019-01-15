package com.lecture.nine;

import java.util.Scanner;

public class JamesBond {

    /**
     * Using the scanner we will a string.
     * then we will check the string with array information and if some secret string is located we repleace with
     * 007
     *
     * secret keys are James Bond, agent
     * if you find secret keys put 007
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello enter text");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String differentSentence = sentence.replaceAll("(?i)James Bond","007");
        differentSentence = differentSentence.replaceAll("(?i)agent","007");
        System.out.println(differentSentence);

        if(sentence.equals(differentSentence)){
            System.out.println("There was no secret key.");
        }



    }
}
