package com.zheng2x2.baseball;

import java.util.Scanner;

public class ProceedGame {

    public String readInputVal() {
        System.out.println("숫자를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String inputVal = readInputVal();

        if(!validationInput(inputVal)) {
            readInputVal();
        }
        return inputVal;
    }

    private boolean validationInput(String val) {

        if(val.length() != 3) {
            return false;
        }

        String[] arr = val.split("");

        for(int i=0; i<arr.length; i++) {
            if (arr[i].equals(arr[i + 1]) || arr[i].matches("^[0-9]*$")) {
                return false;
            }
        }
        return true;
    }


}
