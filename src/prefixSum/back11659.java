// 구간 합 구하기 4

package prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class back11659 {
    public static void main(String[] args) throws IOException {
        // 입력 값이 많을 때는 Scanner보다는 속도가 빠른 BufferedReader를 사용하는 것이 좋다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄에 입력받는 값이 많을 때는 int로 받는 것 보다 StringTokenizer를 사용하는 것이 좋다.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[suNo + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i < suNo + 1; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int j = 0; j < quizNo; j++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int st = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[end]-S[st-1]);
        }
    }
}

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[] S = new int[N+1];
//        for (int i = 1; i <= N; i++){
//            int a = sc.nextInt();
//            S[i] = S[i-1] + a;
//        }
//        int[] stArr = new int[M];
//        int[] enArr = new int[M];
//        for (int j = 0; j < M; j++){
//            int st = sc.nextInt();
//            int en = sc.nextInt();
//            System.out.println(S[en] - S[st-1]);
//        }