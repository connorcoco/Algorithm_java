// 수들의 합 5

package BOJ.TwoPointer;

import java.util.Scanner;

public class baek2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int st_index = 0;
        int en_index = 0;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = i+1;
        }

        long sum = 1;
        int cnt = 0;
        while (en_index < N) {
            if (sum < N) {
                en_index++;
                sum += A[en_index];
            } else if (sum > N) {
                sum -= A[st_index];
                st_index++;
            } else {
                cnt++;
                en_index++;
                if (en_index != N) sum += A[en_index];
            }
        }
        System.out.println(cnt);
    }
}
