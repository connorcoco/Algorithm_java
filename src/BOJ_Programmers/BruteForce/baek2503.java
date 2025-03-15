// week2 : [BOJ / Brute Force] 2503 (숫자 야구 / 실버 3)

package BOJ_Programmers.BruteForce;

import java.io.*;
import java.util.*;

public class baek2503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;

        int[] arr = new int[988];
        for (int i = 123; i < 988; i++) {
            String str = Integer.toString(i);

            if (str.charAt(0) == str.charAt(1) || str.charAt(0) == str.charAt(2) || str.charAt(1) == str.charAt(2)
                    ||str.charAt(0)=='0' || str.charAt(1)=='0' ||str.charAt(2)=='0') {
                arr[i] = -1;
            }
        }
        String strNum;
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < N; i++) {
            strNum = sc.next();
            strike = sc.nextInt();
            ball = sc.nextInt();

            int strikeCnt = 0;
            int ballCnt = 0;

            for (int k = 123; k <= 987; k++) {
                if (arr[k] == -1) continue;

                strikeCnt = 0;
                String strIdx = Integer.toString(k);
                for (int j = 0; j < 3; j++) {
                    if (strNum.charAt(j) == strIdx.charAt(j)) strikeCnt++;
                }

                ballCnt = 0;
                for (int p = 0; p < 3; p++) {
                    for (int q = 0; q < 3; q++) {
                        if ((strNum.charAt(p) == strIdx.charAt(q)) && (p != q)) {
                            ballCnt++;
                        }
                    }
                }

                if ((strike == strikeCnt) && (ball == ballCnt)) {
                    arr[k]++;
                } else {
                    arr[k] = -1;
                }
            }

        }

        for (int i = 123; i <= 987; i++) {

            if (arr[i] != -1 && arr[i] == N) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
