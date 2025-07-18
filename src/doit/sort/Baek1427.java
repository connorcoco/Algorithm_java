// 선택 정렬

package doit.sort;

import java.io.*;
import java.util.*;

public class Baek1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] nCharArr = br.readLine().toCharArray();
        int N = nCharArr.length;
        int[] nArr = new int[N];

        for (int i = 0; i < N; i++) {
            nArr[i] = Integer.parseInt(String.valueOf(nCharArr[i]));
        }

        for (int i = 0; i < N; i++) {
            int max = 0;
            int maxIndex = i;
            for (int j = i; j < N; j++) {
                if (nArr[j] > max) {
                    max = nArr[j];
                    maxIndex = j;
                }
            }
            swap(nArr, i, maxIndex);
        }

        StringBuilder sb = new StringBuilder();

        for (int num : nArr) {
            sb.append(num);
        }

        System.out.print(sb.toString());
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
        return;
    }
}
