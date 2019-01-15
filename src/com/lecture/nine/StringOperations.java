package com.lecture.nine;

public class StringOperations {
    public static void main(String[] args) {
        String name = "Murat";
        String names = name.replace("rat","");
        System.out.println(names);

        String anotherName = "Murat is rat";
        String anotherNames = anotherName.replaceAll("rat","");
        System.out.println(anotherNames);

        String anotherString = anotherName.replace("rat","");



    }
}
