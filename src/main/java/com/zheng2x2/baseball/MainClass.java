package com.zheng2x2.baseball;

import com.zheng2x2.baseball.core.CalculateScoreClass;
import com.zheng2x2.baseball.core.GenerateRandomNumberClass;
import com.zheng2x2.baseball.util.ReadClass;

/**
 * 진행 방식
 * •미션은기능요구사항,프로그래밍요구사항,과제진행요구사항세가지로구성되어 있다.
 * •세개의요구사항을만족하기위해노력한다.특히기능을구현하기전에기능목록을 만들고,기능단위로commit하는방식으로진행한다.
 *
 * 숫자야구게임 - 기능 요구사항
 * 기본적으로1부터9까지서로다른수로이루어진3자리의수를맞추는게임이다.
 * 같은수가같은자리에있으면스트라이크,다른자리에있으면볼,같은수가전혀없으면포볼또는낫싱이란힌트를 얻고,그힌트를이용해서먼저상대방(컴퓨터)의수를맞추면승리한다.
 * [예]상대방(컴퓨터)의수가425일때,123을제시한경우:1스트라이크,456을제시한경우:1스트라이크1볼, 789를제시한경우:낫싱
 * •위숫자야구게임에서상대방의역할을컴퓨터가한다.컴퓨터는1에서9까지서로다른임의의수3개를선택한다.
 *
 * 게임플레이어는컴퓨터가생각하고있는3개의숫자를입력하고,컴퓨터는입력한숫자에대한결과를출력한다.
 * •이같은과정을반복해컴퓨터가선택한3개의숫자를모두맞히면게임이종료된다.
 * •게임을종료한후게임을다시시작하거나완전히종료할 수 있다.
 *
 */
public class MainClass {

  static int ranNum;
//  static Scanner sc;

  public static void main(String[] args) {
    /**
     * get ready with the Answer Number ...
     */
    GenerateRandomNumberClass generator = new GenerateRandomNumberClass();
    ranNum = generator.getRandomNumber();

    /**
     * game start
     */
    ReadClass reader = new ReadClass();
    String answer = reader.readAnswer();

    CalculateScoreClass score = new CalculateScoreClass();
    //answer.볼인지 스트라이크인지 아웃인지 체크)
    String[] tempScore = score.getScore(answer);
    System.out.println(tempScore);

    if ("3스트라이크".equals(tempScore)) {
      System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
      String cmd = reader.readCmd();
      if("1".equals(cmd)) {
        //새로시작 recursive ???
      }
    }



  }
}
