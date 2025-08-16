// https://school.programmers.co.kr/learn/courses/30/lessons/12980
// 점프와 순간 이동

package programmers;

public class Ex71 {
    public int solution(int n) {
        int ans = 0;

        while (n > 0) {
            // n이 홀수일 때는 1을 빼서 짝수로 만들기
            if (n%2 != 0) {
                n -= 1;
                ans++;
            }
            n /= 2;
        }

        return ans;
    }
}
