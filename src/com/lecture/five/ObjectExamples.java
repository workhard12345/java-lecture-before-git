package com.lecture.five;

import java.math.BigDecimal;

public class ObjectExamples {
    /**
     * Difference between an Integer and int in Java with Examples
     * <p>
     * https://www.geeksforgeeks.org/difference-between-an-integer-and-int-in-java/
     * <p>
     * https://howtodoinjava.com/java/basics/correctly-compare-float-double/
     */
    public static void main(String[] args) {
        //Integer related cases.
        int number1 = 1;
        Integer number2 = 1;
        Integer number3 = new Integer(1);

        if (number1 == number2) {
            System.out.println("number1 and number2 is the same value case1");
        }

        if (number1 == number3) {
            System.out.println("number1 and number3 is the same value case2");
        }

        if (number2 == number3) {
            System.out.println("number2 and the number3 cannot print because not same address. case3");
        }

        if (number2.compareTo(number3) == 0) {
            System.out.println("number2 and number3 is the same value case4");
        }

        //Float related cases.

        float float1 = 1.2f;
        float float4 = 1.2f;
        Float float2 = 1.2f;
        Float float3 = new Float(1.2);

        if (float1 == float2) {
            System.out.println("float1 and float2 is the same value case5");
        }

        if (float1 == float3) {
            System.out.println("float1 and float3 is the same value case6");
        }

        if (float2 == float3) {
            System.out.println("float2 and the float3 cannot print because not same address. case7");
        }

        if (float2.compareTo(float3) == 0) {
            System.out.println("float2 and float3 is the same value case8");
        }

        if (float1 == float4) {
            System.out.println("float1 and float4 is the same value case8");
        }


        /**
         * You shouldn't ever compare floats or doubles for equality; because, you can't really guarantee
         * that the number you assign to the float or double is exact.
         */
        float float5 = 1.2f;
        double double1 = 1.2;

        if (float5 == double1) {
            System.out.println("This will not print");
        }


        //Double related cases.

        double double2 = 1.2;
        double double3 = 1.2;
        Double double4 = 1.2;
        Double double5 = new Double(1.2);

        if (double2 == double4) {
            System.out.println("double2 and double4 is the same value case9");
        }

        if (double2 == double5) {
            System.out.println("double2 and double5 is the same value case10");
        }

        if (double4 == double5) {
            System.out.println("double4 and the double5 cannot print because not same address. case11");
        }

        if (double4.compareTo(double5) == 0) {
            System.out.println("double4 and double5 is the same value case12");
        }

        if (double2 == double3) {
            System.out.println("double2 and double3 is the same value case13");
        }

        double double6 = 1.2;
        double double7 = 1.2;
        if (double6 > double7) {
            System.out.println("double6 is bigger than double7");
        } else if (double7 > double6) {
            System.out.println("double7 is bigger than double6");
        } else {
            System.out.println("double6 and double7 is same");
        }


        String string1 = "Murat";
        String string2 = new String("Murat");
        String string3 = "Murat";
        String string4 = new String("Murat");
        String string5 = new String("murat");
        if (string2 == string4) {
            System.out.println("Is objects same?");
        }


        if (string1 == string3) {
            System.out.println("It is the same address so it is same.");
        }

        if (string1 == string2) {
            System.out.println("It will not print as its address is different");
        }

        if (string3.equals(string1)) {
            System.out.println("String values are correct so it will print");
        }

        if (string4.equals(string5)) {
            System.out.println("It will not print because we check case sensitive way.");
        }

        if (string4.equalsIgnoreCase(string5)) {
            System.out.println("It will print as it is now checks case sensitive way.");
        }


/**
 *
 */
        float someCalculationFloat = 0;

        for (int counter = 0; counter < 10; counter++) {
            someCalculationFloat += .1;
        }

        float someCalculationFloat1 = .1f * 10f;

        if (someCalculationFloat == someCalculationFloat1) {
            System.out.println("It should print right?");
        }


        double someCalculationDouble = 0;

        for (int counter = 0; counter < 10; counter++) {
            someCalculationDouble += .1;
        }

        double someCalculationDouble1 = .1f * 10f;

        if (someCalculationDouble == someCalculationDouble1) {
            System.out.println("It should print right?");
        }


        Float someCalculationFloatObject = 0f;

        for (int counter = 0; counter < 10; counter++) {
            someCalculationFloatObject += new Float(.1f);
        }

        Float someCalculationFloatObject1 = new Float(.1f) * new Float(10f);

        if (someCalculationFloatObject.compareTo(someCalculationFloatObject1) == 0) {
            System.out.println("It should print right?");
        }


        //2. Compare double – Threshold based comparison [Recommended]
        //3. Compare double – Compare with BigDecimal [Recommended]
        /**
         * Compare double – Threshold based comparison [Recommended]
         * Lets do comparing in proper way. Method 1
         */
        double threshold = .0001;


        double properWayDouble = 0;

        for (int counter = 0; counter < 10; counter++) {
            properWayDouble += .1;
        }

        double properWayDouble1 = .1f * 10f;

        if (Math.abs(properWayDouble - properWayDouble1) < threshold) {
            System.out.println("Yes at last proper way to check");
        }

        /**
         *  Compare double – Compare with BigDecimal [Recommended]  Method 2
         */
        BigDecimal properWayBigDecimal = BigDecimal.ZERO;

        for (int counter = 0; counter < 10; counter++) {
            properWayBigDecimal = properWayBigDecimal.add(new BigDecimal(".1"));
        }

        BigDecimal sometimes =new BigDecimal(".1");

        BigDecimal properWayBigDecimal1 = sometimes.multiply(new BigDecimal(10));
        properWayBigDecimal1 = properWayBigDecimal1.setScale(4, BigDecimal.ROUND_HALF_DOWN);


        if (properWayBigDecimal.compareTo(properWayBigDecimal1) == 0) {
            System.out.println("Yes at last proper way to check MethodCaller one");
        }


    }
}
