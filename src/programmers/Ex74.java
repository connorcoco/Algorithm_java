// https://school.programmers.co.kr/learn/courses/30/lessons/12945
// 피보나치 수
// 문제 핵심 : 오버플로 해결
// int, long 모두 오버플로가 날 정도로 큰 수가 되는게 나머지 연산은 미리 하든 나중에 하든 값이 같은 성질을 이용

package programmers;

public class Ex74 {
    public int solution(int n) {

        return (int)(fibo(n) % 1234567l);
    }

    long fibo(int k) {
        long n = 0;
        long n2 = 0;
        long n1 = 1;
        for (int i = 2; i <= k; i++) {
            n = (n2 + n1) % 1234567;
            n2 = n1;
            n1 = n;
        }
        return n;
    }
}
