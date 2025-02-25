// 좋다

package BOJ.TwoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        long[] A = new long[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);

        int cnt = 0;
        for (int t = 0; t < N; t++) {
            int i = 0;
            int j = N-1;
            while (i < j) {
                if (i == t) {
                    i++;
                    continue;
                } else if (j == t) {
                    j--;
                    continue;
                }

                if (A[i] + A[j] == A[t]) {
                    cnt++;
                    break;
                } else if (A[i] + A[j] < A[t]) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        System.out.println(cnt);
    }
}
