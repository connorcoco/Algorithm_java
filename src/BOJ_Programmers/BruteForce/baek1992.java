// week2 : [BOJ / Brute Force] 1992 (쿼드 트리 / 실버 1)

package BOJ_Programmers.BruteForce;

import java.io.*;
import java.util.*;

public class baek1992 {

    static StringBuilder sb = new StringBuilder();
    static int[][] data;

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        data = new int[N][N];

        // 데이터 입력
        for (int i = 0; i < N; i++) {
            String str = bf.readLine();
            for (int j = 0; j < N; j++) {
                data[i][j] = str.charAt(j) - '0';
            }
        }

        quadTree(0, 0, N);
        System.out.println(sb);
    }

    public static void quadTree(int y, int x, int n) {
        if (isSame(y, x, n)) {
            sb.append(data[y][x]);
        } else {
            sb.append('(');
            quadTree(y, x, n/2);
            quadTree(y, x+n/2, n/2);
            quadTree(y+n/2, x, n/2);
            quadTree(y+n/2, x+n/2, n/2);
            sb.append(')');
        }
    }

    public static boolean isSame (int y, int x, int n) {
        if (n == 1) {
            return true;
        } else {
            int num = data[y][x];
            for (int i = y; i < y+n; i++) {
                for (int j = x; j < x+n; j++) {
                    if (num != data[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
