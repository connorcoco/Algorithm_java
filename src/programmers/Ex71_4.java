// https://school.programmers.co.kr/learn/courses/30/lessons/12914
// 멀리 뛰기

package programmers;

// 1칸 -> 0에서 +1 (1)
// 2칸 -> 0에서 +2, 1에서 +1 (2)
// 3칸 -> 1에서 +2, 2에서 +1 (3)
// ...
// n칸 -> n-2에서 +2, n-1에서 +1 (n-1칸의 가짓수 + n-2칸의 가짓수)

public class Ex71_4 {
    final long N = 1234567;

    public long solution(int n) {
        if (n == 1) return 1L;

        long[] numArr = new long[n];
        numArr[0] = 1L;
        numArr[1] = 2L;

        for (int i = 2; i < n; i++) {
            numArr[i] = (numArr[i-2] + numArr[i-1]) % N;
        }

        return numArr[n-1];
    }
}
