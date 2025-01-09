// 나머지 합

package PrefixSum;

import java.util.Scanner;

public class baek10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N+1];
        long[] arr = new long[M];

        for (int n = 1; n < N+1; n++){
            long a = sc.nextInt();
            S[n] = S[n-1] + a;
        }

        for (int n = 1; n < N+1; n++){
            int ramainNum = (int) (S[n] % M);
            arr[ramainNum]++;
        }

        long sum = 0;
        for (int i = 0; i < M; i++){
            if(i == 0) sum += arr[0];
            if(arr[i] > 1){
                sum += arr[i]*(arr[i]-1)/2;
            }
        }
        System.out.println(sum);
    }
}
