package com.lecture.four;

public class CastOperations {

    public static void main(String[] args) {
        float someDoubleNumber = 2123.999f;
        int someIntNumber;

        someIntNumber = (int) someDoubleNumber;
        System.out.println(someIntNumber);

        char someChar ='C';
        someIntNumber = (int) someChar;
        System.out.println(someIntNumber);

        float someFloatNumber = ((10*(12+5))*10)/2;
        System.out.println(someFloatNumber);

    }
}
