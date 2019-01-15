package com.lecture.eight;

public class ConstructorCaller {

    public static void main(String[] args) {
        Person person = new Person("Beyonce","Knightley",45,"Female");

        VarArgsExample varArgsExample = new VarArgsExample();
        int result = varArgsExample.sum(1,2,34,5,7,9345,23,5,134,6);
        System.out.println("Result: "+result);

        AgeDefiner ageDefiner = new AgeDefiner();
        ageDefiner.womanAge(123,12,3,2,7,123,85,23,12,45);
        ageDefiner.manAge(12,21,6,3,12,32,46,65,42);



    }


}
