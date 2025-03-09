// 주몽의 명령

package BOJ_Programmers.TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int st_index = 0;
        int en_index = N-1;
        int cnt = 0;
        while (st_index < en_index) {
            if ((A[st_index] + A[en_index]) == M) {
                cnt++;
                en_index--;
                st_index++;
            } else if ((A[st_index] + A[en_index]) < M) {
                st_index++;
            } else {
                en_index--;
            }
        }
        System.out.println(cnt);
    }
}
