// https://school.programmers.co.kr/learn/courses/30/lessons/12953
// N개의 최소공배수

package programmers;

import java.util.*;

// 입력받은 수들의 최소공배수를 구하라.
// n개의 수 중 가장 큰 수를 기준으로 1,2,3...곱해나가며 나머지 n-1개의 수가 모두 나누어 떨어질 때를 찾는 방법
// -> 이중for문이긴 하지만 바깥의 for문이 가장 조금 수행되게끔 하는 방법

public class Ex71_3 {
    public int solution(int[] arr) {
        int answer = 0;

        // 주어진 배열 정렬
        Arrays.sort(arr);

        // 가장 큰 수의 배수 for문
        int rear = arr[arr.length-1];
        int k = 1;
        while (true) {
            boolean isAnswer = true;
            int pub = k * rear;

            // 나머지 수들과 나누어 떨어지는지 검사
            for (int i = 0; i < arr.length-1; i++) {
                if (pub % arr[i] != 0) {
                    isAnswer = false;
                    break;
                }
            }
            // 모두 나누어 떨어졌다면 정답 반환
            if (isAnswer) {
                answer = pub;
                break;
            }

            // 아니라면 배수++
            k++;
        }

        return answer;
    }
}
