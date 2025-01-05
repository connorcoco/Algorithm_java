// 구간 합 구하기 4

package prefixSum;

import java.util.Scanner;

public class back11659 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] S = new int[N+1];
        for (int i = 1; i <= N; i++){
            int a = sc.nextInt();
            S[i] = S[i-1] + a;
        }
        int[] stArr = new int[M];
        int[] enArr = new int[M];
        for (int j = 0; j < M; j++){
            int st = sc.nextInt();
            int en = sc.nextInt();
            System.out.println(S[en] - S[st-1]);
        }
    }
}
