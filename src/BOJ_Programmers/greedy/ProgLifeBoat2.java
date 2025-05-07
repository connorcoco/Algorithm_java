// week7 : [Programmers / Greedy] 구명보트 (lv2)

package BOJ_Programmers.greedy;

import java.util.Arrays;

public class ProgLifeBoat2 {
    int limit;
    int answer = 0;
    public int solution(int[] people, int limit) {
        this.limit = limit;
        Arrays.sort(people);

        int st = 0;
        int en = people.length-1;
        while (st <= en) {
            // 다 짝을 찾고 혼자 남았을 때
            if (st == en) {
                answer++;
                break;
            }

            en = findBest(st, en, people)-1;
            st++;
        }

        return answer;
    }

    private int findBest(int st, int en, int[] people) {
        for (int i = en; i > st; i--) {
            if (people[st] + people[i] <= limit) {
                answer++;
                return i;
            } else {
                answer++;
            }
        }
        // en에 있던 사람들을 모두 보내고 st == en가 된 상황 -> st에 있던 애도 배 태우기
        answer++;
        return st;
    }
}
