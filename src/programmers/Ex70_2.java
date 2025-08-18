// https://school.programmers.co.kr/learn/courses/30/lessons/12985
// 예상 대진표

package programmers;

// 이긴 사람이 새로 받는 번호는 (이전번호+1)/2 번이다.
// 첫 판의 최고숫자는 N이고 이것이 1/2로 되다가 1이 될때까지 게임을 진행한다.
// for문을 돌면서 각 판이 지났을때의 a, b의 번호를 최신화해가며 이 둘이 일치해질때 return을 하는 방법
public class Ex70_2 {
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        // A, B는 판이 지났을때의 바뀐 번호를 나타냄
        int A = a;
        int B = b;

        int round = 0;
        while (n > 1) {
            round++;
            // 다음 판에 이겼을 때의 번호가 같다면 해당 판에 둘이 경기를 한다는 뜻
            if ((A+1)/2 == (B+1)/2) {
                return round;
            } else {
                n /= 2;
            }
            // 현재 판이 끝난 후에 새로 받은 번호
            A = (A+1)/2;
            B = (B+1)/2;

        }

        return answer;
    }
}
