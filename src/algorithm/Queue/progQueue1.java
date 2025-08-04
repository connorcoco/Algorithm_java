// week1 : [Programmers / Queue] 기능개발 (lv2)

package algorithm.Queue;

import java.util.*;

public class progQueue1 {
    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> answerList = new ArrayList<>();

            Queue<Process> processes = new LinkedList<>();

            for(int i = 0; i < progresses.length; i++) {
                processes.offer(new Process(progresses[i], speeds[i]));
            }

            int time = 0;
            while (!processes.isEmpty()) {
                Process front = processes.peek();

                // 현재까지의 작업량
                int currentProgress = front.progress + front.speed * time;
                if (currentProgress >= 100) {
                    if (!answerList.isEmpty()) {
                        answerList.set(answerList.size() - 1, answerList.get(answerList.size() - 1) + 1);
                    } else {
                        answerList.add(1);
                    }
                    processes.poll();
                    continue;
                }

                if ((100 - front.progress) % front.speed == 0) {
                    time = (100 - front.progress) / front.speed;
                } else {
                    time = (100 - front.progress) / front.speed + 1;
                }
                answerList.add(1);
                processes.poll();
            }
            return answerList.stream().mapToInt(Integer::intValue).toArray();
        }
        static class Process {
            int progress;
            int speed;

            Process(int p, int s) {
                this.progress = p;
                this.speed = s;
            }
        }
    }

}
