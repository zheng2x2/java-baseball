package com.zheng2x2.baseball;

import java.util.Random;

public class GenerateNumber {

    private int getRandomNumber() {
        int upperbound = 9;
        return new Random().nextInt(upperbound) + 1;
    }

    public String getThreeNumbers() {
        String returnStr = "";
        while (returnStr.length()<3) {
            String ranNum = String.valueOf(getRandomNumber()) ;
            if(!returnStr.contains(ranNum)) {
                returnStr += ranNum;
            }
        }

        return returnStr;
    }
}
