package com.lecture.five;

public class StringOperations {

    public static void main(String[] args) {
        String helloWorld = "Hello, World";
        String someString = helloWorld.substring(1,5);
        String someString1 = helloWorld.substring(5);

        System.out.println(someString);
        System.out.println(someString1);

        int lengthOfString = helloWorld.length();
        System.out.println(lengthOfString); //12

        int indexOfComma = helloWorld.indexOf(",");
        System.out.println(indexOfComma);   //5

        int lastIndexOfO = helloWorld.lastIndexOf("o");
        System.out.println(lastIndexOfO);  //8 4

        int lastIndexOfBigO = helloWorld.lastIndexOf("O");
        System.out.println(lastIndexOfBigO);  //Error

    }


}
