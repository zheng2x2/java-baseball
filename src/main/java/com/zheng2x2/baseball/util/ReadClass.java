package com.zheng2x2.baseball.util;

import java.util.Scanner;

public class ReadClass {

    Scanner sc;
    String answer;

    public String readAnswer() {
        sc = new Scanner(System.in);
        do {
            System.out.println("숫자를 입력해주세요 : ");
            answer = sc.next();
        } while (answer == null || answer.isEmpty() || !ifAnswerHas3Nums(answer) );

        sc.close();
        return answer;
    }

    private boolean ifAnswerHas3Nums(String answer) {
        if(answer.length()==3 && answer.matches(".*\\d.*")){
            return true;
        };
        return false;
    }

    public String readCmd() {
        sc = new Scanner(System.in);
        do {
            answer = sc.next();
        } while (answer == null || answer.isEmpty() || !"1".equals(answer) || !"2".equals(answer));

        sc.close();
        return answer;
    }
}
