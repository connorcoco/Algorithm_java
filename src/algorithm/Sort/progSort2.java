// week6 : [Programmers / Sort] H-index (lv2)

package algorithm.Sort;

import java.util.*;

public class progSort2 {
    public int solution(int[] citations) {
        int n = citations.length;

        int max = 0;
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            int h = citations[i];
            if ((n-i) >= h) {
                if (i <= h){
                    max = h;
                }
            }
        }

        return max;
    }
}
