package com.lecture.six;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {1, 2, 3, 4, 5, 6};
        /**
         * Print all the array values
         */
        for (int item : arrayOfIntegers) {
            System.out.println(item);
        }
        System.out.println(Arrays.toString(arrayOfIntegers));
        /**
         * Print all except if the value is 1
         */
        for (int item : arrayOfIntegers) {
            if (item != 1) {
                System.out.println(item);
            }
        }
        /**
         * Print all except if the value is 1  use continue)
         */
        for (int item : arrayOfIntegers) {
            if (item == 1) {
                continue;
            } else {
                System.out.println(item);
            }

        }
        /**
         * Print items until 4 shows up use break;
         */
        for (int item : arrayOfIntegers) {
            if (item == 4) {
                break;
            }
            System.out.println(item);
        }


    }
}
