// https://school.programmers.co.kr/learn/courses/30/lessons/138476
// 귤 고르기

package programmers;

import java.util.*;

public class Ex71_2 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> tanMap = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            if (tanMap.containsKey(tangerine[i])) {
                tanMap.replace(tangerine[i], tanMap.get(tangerine[i])+1);
            } else {
                tanMap.put(tangerine[i], 1);
            }
        }

        ArrayList<Integer> tanCountList = new ArrayList<>();

        for (Integer value: tanMap.values()) {
            tanCountList.add(value);
        }
        Collections.sort(tanCountList, Collections.reverseOrder());

        int count = 0;
        while (k > count) {
            count += tanCountList.get(answer);
            answer++;
        }

        return answer;
    }
}
