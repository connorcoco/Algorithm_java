// week7 : [Programmers / Greedy] 구명보트 (lv2)

package BOJ_Programmers.greedy;

import java.util.*;

public class ProgLifeBoat {
    int limit;
    int answer = 0;
    int n;
    public int solution(int[] people, int limit) {
        n = people.length;

        this.limit = limit;
        Arrays.sort(people);

        for (int i = 0; i < n; i++) {
            // 이미 보트를 탄 사람
            if (people[i] == 241) continue;

            // 마지막에 혼자 남은 사람
            if (i == n-1) {
                answer++;
                break;
            }

            // 최대로 무게를 채워서 보트를 태우기
            findBest(i, people);
        }

        return answer;
    }

    private void findBest(int k, int[] people) {
        for (int i = k+1; i < n; i++) {
            if (people[k] + people[i] <= limit) {
                if (i == n-1) {
                    people[k] = 241;
                    people[i] = 241;
                    answer++;
                }
                continue;
            }

            if (i == k+1) {
                people[k] = 241;
            } else {
                people[k] = 241;
                people[i-1] = 241;
            }
            answer++;
            break;
        }
    }
}