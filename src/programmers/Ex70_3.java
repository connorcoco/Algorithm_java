// https://school.programmers.co.kr/learn/courses/30/lessons/131701
// 연속 부분 수열 합의 개수

package programmers;

import java.util.*;

// 주어진 원소들의 연속되는 값들로만 만들어진 합의 개수
// for문을 돌면서 1개의 원소의 합, 2개의, 3개의, ... n개의 원소의 합까지 모두 Set에 저장하고
// 마지막에 Set의 size를 return하는 방법
public class Ex70_3 {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < elements.length ; i++){
            int num = 0;
            for(int j = 0 ; j < elements.length ; j++){
                num += elements[(i+j)%elements.length];
                set.add(num);
            }
        }
        return set.size();
    }
}
