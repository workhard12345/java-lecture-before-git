package com.lecture.five;

public class LoopOperations {
    public static void main(String[] args) {
        int counter = 3;

        while (counter > 1) {       //forever
            System.out.println(counter);
            counter--; //counter = counter - 1;
        }

        String helloWorld = "Hello World";
        int characterCount = 0;

        while(helloWorld.length()>characterCount){
            System.out.print(helloWorld.charAt(characterCount));
            characterCount++;
        }

        System.out.println();
        for(characterCount=0;characterCount<helloWorld.length();characterCount++){
            System.out.print(helloWorld.charAt(characterCount));
        }









    }
}
