// week1 : [Programmers / Queue] 다리를 지나는 트럭 (lv2)

package algorithm.Queue;

import java.util.*;

public class progQueue2 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> onBridgeQue = new LinkedList<>();
        Queue<Integer> beforeBridgeQue = new LinkedList<>();

        for (int truck: truck_weights) {
            beforeBridgeQue.offer(truck);
        }

        // 다리 위 큐를 0으로 채움
        for (int i = 0; i < bridge_length; i++) {
            onBridgeQue.offer(0);
        }

        int onBridgeWeight = 0;

        // 반복문이 한번 돌 때마다 큐에서 poll을 하면서 시간을 1추가 -> 오른쪽으로 들어와서 1초에 한칸씩 왼쪽으로 땡겨지다가 poll을 함으로써 다리를 지남
        while (!beforeBridgeQue.isEmpty() || !onBridgeQue.isEmpty()) {
            answer++;
            onBridgeWeight -= onBridgeQue.poll();

            if (!beforeBridgeQue.isEmpty()) {
                if (onBridgeWeight + beforeBridgeQue.peek() <= weight) {
                    int front = beforeBridgeQue.poll();
                    onBridgeQue.offer(front);
                    onBridgeWeight += front;
                } else {
                    onBridgeQue.offer(0);
                }
            }
        }
        return answer;
    }
}
