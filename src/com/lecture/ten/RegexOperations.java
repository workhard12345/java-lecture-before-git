package com.lecture.ten;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOperations {


    public static void main(String[] args) {
        /**
         * Pattern object is the compiled version of the regular expression.
         * Pattern class doesn’t have any public constructor and we use it’s public static method compile to
         * create the pattern object
         * by passing regular expression argument.
         */

        /**
         *  Matcher is the java regex engine object that matches the input String pattern
         *  with the pattern object created. Matcher class doesn’t have any public constructor and we get a
         *  Matcher object using pattern object matcher method that takes the input String as argument.
         *  We then use matches method that returns boolean result based on input String matches the regex pattern or not.
         */
        Pattern pattern = Pattern.compile(".xx.");
        //Scanner scanner = new Scanner(System.in);
        String someDummyString = "";

        Matcher matcher = pattern.matcher(someDummyString);
        System.out.println("Input String matches the regex - " + matcher.matches());


        /**
         *  . Matches any single character
         */
        Pattern pattern1 = Pattern.compile("(?i)..xx.");
        Matcher matcher1 = pattern1.matcher(someDummyString);
        System.out.println("Input String matches - " + matcher1.matches());

        /**
         * ^xxx   Matches xxx regex at the beginning of the line
         * (“^a.c.”, “abcd”) – true
         */
        System.out.println("Using the String matches - " +
                someDummyString.matches("^xxx"));

        String anotherString1 = "a1c11";
        System.out.println("Using String matches method: "+anotherString1.matches("^a.c."));
        System.out.println("Using String matches method: "+anotherString1.matches("^a1..."));
        /**
         * xxx$   Matches regex xxx at the end of the line
         */
        String anotherString2 = "a1c11";
        System.out.println("Using String matches method: "+anotherString2.matches("..11$"));
        System.out.println("Using String matches method: "+anotherString2.matches("...11$"));

        /**
         * [abc]   Can match any of the letter a, b or c. [] are known as character classes.
         */
        anotherString2 = "ab";
        System.out.println("Using String matches method: "+anotherString2.matches("[abc]."));
        System.out.println("Using String matches method: "+anotherString2.matches("[c]."));

        /**
         * [abc][12]   Can match a, b or c followed by 1 or 2
         */
        String anotherString4 = "a1";
        System.out.println("Using String matches method: "+anotherString4.matches("[abc][12]"));
        System.out.println("Using String matches method: "+anotherString4.matches("[abc]"));
        /**
         * Common Matching Symbols
         * [^abc]   When ^ is the first character in [], it negates the pattern,
         * matches anything except a, b or c
         */
        String anotherString5 = "c3#";
        System.out.println("Using String matches method: "+anotherString5.matches("[^abc]"));
        System.out.println("Using String matches method: "+anotherString5.matches("[abc].."));
        System.out.println("Using String matches method: "+anotherString5.matches("[^ab].."));

        /**
         * [a-e1-8]   Matches ranges between a to e or 1 to 8
         */
        String anotherString6 = "a2#";
        System.out.println("Using String matches method: "+anotherString6.matches("[a-e1-8]"));
        System.out.println("Using String matches method: "+anotherString6.matches("[a-e1-8].."));
        System.out.println("Using String matches method: "+anotherString6.matches("[^ab].."));
        /**
         * xx|yy   Matches regex xx or yy
         */
        String anotherString7 = "a2#";
        System.out.println("Using String matches method: "+anotherString7.matches("a2.|y"));
        System.out.println("Using String matches method: "+anotherString7.matches("[a-e1-8].|a.."));

        /**
         * \d Any digits, short of [0-9]
         * \D Any non-digit, short for [^0-9]
         * \s Any whitespace character, short for [\t\n\x0B\f\r]
         * \S Any non-whitespace character, short for [^\s]
         * \w Any word character, short for [a-zA-Z_0-9]
         * \W Any non-word character, short for [^\w]
         */
        String s1="My name is Bond. James Bond.";
        String replaceString=s1.replaceAll("\\s","");
        System.out.println(replaceString);

        String s2="My name is Bond James Bond.?,!;:--([])({})'\"' '. . .***";
        String replaceString1=s2.replaceAll("\\p{Punct}","");
        System.out.println(replaceString1);

        String s3="My name is Bond James Bond.?,!;:--([])({})'\"' '. . .***1.23";
        String replaceString2=s3.replaceAll("[^\\d.]","");
        System.out.println(replaceString2);

        String s4="-1asdasd.23asdasd";
        String digits = s4.replaceAll("[^0-9.-]", "");
        System.out.println(digits);

    }


}
