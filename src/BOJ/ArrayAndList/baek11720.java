package BOJ.ArrayAndList;

import java.util.Scanner;

public class baek11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String strNumber = sc.next();
        char[] charNumber = strNumber.toCharArray();
        int sum = 0;
        for (int i = 0; i < N; i++){
            sum += Integer.parseInt(String.valueOf(charNumber[i]));
        }
        System.out.println(sum);
    }
}
