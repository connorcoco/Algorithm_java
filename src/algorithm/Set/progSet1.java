// week3 : [Programmers / Set] 폰켓몬 (lv1)

package algorithm.Set;

import java.util.*;

public class progSet1 {
    public int solution(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        return Math.max(set.size(), nums.length/2);
    }
}
