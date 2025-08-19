package programmers;

import java.util.*;
// 각 논문의 수에 대해 정렬을 하고 작은 것부터 for문으로 돌면서
// 만약 i 인덱스를 본다고 하면 그 논문의 인용수보다 많이 쓴 논문들의 수는 n-i이고 나머지는 i이다..
// 이때 조건으로 citations[i] <= n-i이고, citations[i] >= i 이면 이 수는 H-Index의 후보!
// 이 조건에 해당하는 값중 최대값을 리턴
public class Ex67 {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < n; i++) {
            int h = n-i;
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}
