package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;

public class day2 {

    public static void main(String[] args) throws Exception {
//        e1();
    }

    // 분수의 덧셈 기약분수 만들기
    public int[] e1(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = numer1 * denom2 + numer2 * denom1;

        int i = 2;
        while (i <= Math.min(denom, numer)) {
            if(denom % i == 0 && numer % i == 0) {
                denom = denom / i;
                numer = numer / i;
                i = 2;
            } else {
                i++;
            }
        }
        return new int[]{numer, denom};
    }

    // 정수 배열 두배하기
    public int[] e2(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            numbers[i] *= 2;
        }
        return numbers;
    }

    // ?????????????????최빈값 구하기
    public int e3(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }

    // 짝수는 싫어요
    public int[] e4(int n) {
        int[] answer = new int[(n+1)/2];

        for (int i = 0; i < (n+1)/2; i++) {
            answer[i] = i*2+1;
        }

        return answer;
    }

//    ArrayList<Integer> answer = new ArrayList<Integer>();
//
//        for(int i=1; i<=n; i++){
//        if(i%2 != 0) {
//            answer.add(i);
//        }
//    }
//
//        return answer;
}
