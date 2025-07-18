// 버블 정렬

package doit.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
        return;
    }
}
