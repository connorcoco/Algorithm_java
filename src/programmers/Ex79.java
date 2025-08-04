// https://school.programmers.co.kr/learn/courses/30/lessons/12941
// 최솟값 만들기

package programmers;

import java.util.Arrays;

public class Ex79 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += (A[i]*B[A.length-i-1]);
        }
        return answer;
    }
}
