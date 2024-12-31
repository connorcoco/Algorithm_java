package day1;

import java.util.Scanner;

public class debugging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        long[] A = new long[10000];
        long[] S = new long[10000];

        for (int i = 1; i < 10000; i++){
            A[i] = (long) (Math.random() * Integer.MAX_VALUE);
            S[i] = S[i-1] + A[i];
        }
        for(int t = 1; t < testcase; t++){
            int query = sc.nextInt();
            for (int i = 0; i < query; i++){
                int start = sc.nextInt();
                int end = sc.nextInt();
                int answer = 0;
                answer += S[end] - S[start - 1];
                System.out.println((i+1) + " " + answer);
            }
        }
    }
}
