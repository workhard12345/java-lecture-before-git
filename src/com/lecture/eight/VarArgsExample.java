package com.lecture.eight;

public class VarArgsExample {

    public int sum(int... numbers){

        int someNumber = numbers[1];
        int result =0;
        for(int number:numbers){
            result=result+number;
        }
        return result;
    }

}
