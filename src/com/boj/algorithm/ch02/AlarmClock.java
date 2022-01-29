package com.boj.algorithm.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220129
 *
 * [문제 번호]
 *
 * 2884
 *
 * [문제]
 * 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
 * 상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
 *
 * 이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
 * 바로 "45분 일찍 알람 설정하기"이다.
 *
 * 이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다.
 * 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
 *
 * 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
 * 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
 *
 * [출력]
 * 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
 */
public class AlarmClock {

    /**
        [오답 풀이]

        ❌ 계속 minute(분) - 45해서 결과값을 얻으려고 하다보니 풀이가 잘 되지 않았다.

        🔨 우선, 45 이하라는것은 음수(-)를 의미하니 hour(시간)에서 1을 빼주고 0 이하인지만 체크 해주면 된다.
        또한 첫 번째 IF(minute < 45) 인 경우 60[기준이되는 분] - (45 - minute)을 해주면 결과값이 출력된다
    */
    public static void main(String[] args) throws IOException {
        /**
            [사용 방법 01 : Scanner]

            Scanner sc = new Scanner(System.in);
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            sc.close();

            [사용 방법 02 : BufferReader]

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String [] str = br.readLine().split(" ");
            System.out.println("str = " + str);

            int hour = Integer.parseInt(str[0]);
            int minute = Integer.parseInt(str[1]);
         */

        // 내가 푼 문제
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        if (minute < 45) {
            hour--;
            minute = 60 - (45 - minute);
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        } else {
            System.out.println(hour + " " + (minute - 45));
        }

        // 참고한 문제
        /*int H = hour;
        int M = minute - 45;
        if (M < 0) {
            M += 60;
            H--;
        }
        if (H < 0) {
           H += 24;
        }
        System.out.println(H + " " + M);*/
    }
}
