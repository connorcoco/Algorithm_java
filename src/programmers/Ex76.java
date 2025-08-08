// https://school.programmers.co.kr/learn/courses/30/lessons/12924
// 숫자의 표현

package programmers;

public class Ex76 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = i;
            for (int j = i+1; j <=n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }

        return ++answer;
    }
}
