package com.zheng2x2.baseball.core;

import java.util.Random;

public class GenerateRandomNumberClass {


    public int getRandomNumber() {

        Random rand = new Random();
        int upperbound = 1000;
        int ranNum1 = rand.nextInt(upperbound);

        int ranNum2 = (int) ( Math.random() * upperbound );
        return 123;
    }

}
