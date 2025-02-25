package BOJ.ArrayAndList;

import java.util.*;

public class baek1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        int sum = 0;
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
        }

        double value = (double)(sum*100)/max;
        System.out.println(value/N);
    }
}
