// https://school.programmers.co.kr/learn/courses/30/lessons/12911
// 다음 큰 숫자

package programmers;

public class Ex75 {
    public int solution(int n) {
        int answer = 0;
        int nCount = getOneCount(n);

        for (int i = n+1; ;i++) {
            if (getOneCount(i) == nCount) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public int getOneCount(int n) {
        int i = 0;
        String s = Integer.toBinaryString(n);
        for (char c: s.toCharArray()) {
            if (c == '1') i++;
        }
        return i;
    }
}
