package jakshim_challenge;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean[] isNotPrime = new boolean[b-a+1];

        for (int i = a; i <= b; i++) {
            if (isNotPrime[i-a]) continue;

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isNotPrime[i-a] = true;
                    if (i/j > j) isNotPrime[i/j-a] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < b-a+1; i++) {
            if (!isNotPrime[i]) System.out.println(i+a);
        }
    }
}
