// https://school.programmers.co.kr/learn/courses/30/lessons/87390
// n^2 배열 자르기

package programmers;

// 다음과 같은 과정을 행했을때 최종 배열의 형태는
// 1234~n/2234~n/3334~n/.../nnnn~n 이러한 1차원 배열이 된다.
// 이 배열만 만들면 끝!
// 위의 배열을 만들면 메모리초과
// 근데 인덱스와 해당 배열의 값의 관계를 알았으니 그냥 left~right까지의 값을 넣으면 된다.

public class Ex68 {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left + 1);
        int[] answer = new int[size];

        for (long i = left; i <= right; i++) {
            answer[(int)(i - left)] = (int)Math.max(i / n, i % n) + 1;
        }

        return answer;
    }
}
