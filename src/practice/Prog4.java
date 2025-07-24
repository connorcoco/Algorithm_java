// 프로그래머스 : K번째수 (https://school.programmers.co.kr/learn/courses/30/lessons/42748)

package practice;

import java.util.ArrayList;
import java.util.List;

public class Prog4 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arrList;
        for (int i=0; i<commands.length; i++) {
            arrList = new ArrayList<>();

            for (int j=commands[i][1]-1; j<commands[i][2]; j++) {
                arrList.add(array[j]);
            }

            for (int k = 0; k < commands[i][2]-2; k++) {
                if (arrList.get(k) > arrList.get(k+1)) {
                    swap(arrList, k, k+1);
                }
            }
            answer[i] = arrList.get(commands[i][2]-1);
        }
        return answer;
    }

    public void swap(List<Integer> list, int a, int b) {
        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);
    }
}
