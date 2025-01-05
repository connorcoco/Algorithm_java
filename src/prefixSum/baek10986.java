// 나머지 합

package prefixSum;

import java.util.Scanner;

public class baek10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] S = new int[N+1];

        for (int n = 1; n < N+1; n++){
            int a = sc.nextInt();
            S[n] = S[n-1] + a;
        }
        int sum = 0;
        for (int j = 1; j < N+1; j++){
            for (int i = 1; i < j+1; i++){
                if((S[j] - S[i-1]) % M == 0){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
