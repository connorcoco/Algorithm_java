// 프로그래머스 : 프로세스 (https://school.programmers.co.kr/learn/courses/30/lessons/42587)

package practice;

import java.util.*;

class Prog2 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int p: priorities) {
            pq.add(p);
        }

        while(!pq.isEmpty()) {
            for (int i=0; i<priorities.length; i++) {
                if (pq.peek() == priorities[i]) {
                    pq.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
