// https://school.programmers.co.kr/learn/courses/30/lessons/42842
// 카펫

package programmers;

// x*y = brown+yellow
// brown = 2*(x+y)-4 --> x+y = (brown+4) /2
public class Ex73 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        // x*y
        int gop = brown+yellow;
        // x+y
        int add = (brown+4) /2;

        for (int y = 3; y < add; y++) {
            if (gop % y == 0) {
                int x = gop/y;
                if (add == x+y) {
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
        }

        return answer;
    }
}
