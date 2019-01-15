package com.lecture.seventeen;

import java.util.Random;

public class RockPaperScissorsUtilities {

    public int getRandomNumber(int bound) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(bound);
        return randomNumber;
    }


}
