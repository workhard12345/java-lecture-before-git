package com.lecture.four;

public class AutoBoxingOperations {
    public static void main(String[] args) {
        int someNumber = 1;
        Integer someObjectInteger = someNumber;
        Integer someObjectInteger1 = new Integer(someNumber);

        int anotherInteger = someObjectInteger;

        System.out.println(someNumber + " " + someObjectInteger1 + " "
                + anotherInteger + " " + someObjectInteger);

        float someDoubleNumber = 2123.9999f;
        Float objectFloatNumber = someDoubleNumber;
        System.out.println(objectFloatNumber);
        System.out.println(objectFloatNumber.intValue());

        int anotherNumber = 23;
        Integer anotherNumber1 = 23;
        if (anotherNumber == anotherNumber1) {
            System.out.println("These numbers are same");
        } else {
            System.out.println("These numbers are not same");
        }

        Integer number1 = 1;
        Integer number2 = 2;
        if (number1 == number2) {
            System.out.println("These are sameasdasd");
        }

        Double double1 = 123.29;
        Double double2 = 123.29;

        int result = double2.compareTo(double1);
        System.out.println(result);


        String asliName = "Asli";
        asliName = "Murat";
        int a = 1;
        a = 2;
        a = 3;


        String myName = "Murat";
        String withNewOne = new String("Murat");
        if (myName == myName) {
            System.out.println("true");
        }

        if (myName == withNewOne) {
            System.out.println("true");
        }

        String anotherString = "Murat";
        if (myName == anotherString) {
            System.out.println("It actually print");
        }

        if (myName == "Murat") {
            System.out.println("This will never print");
        }

        if (myName.equals("Murat")) {
            System.out.println("Hello " + myName);
        }

        if (myName.equalsIgnoreCase("murat")) {
            System.out.println("Hello again" + myName);
        }


    }
}
