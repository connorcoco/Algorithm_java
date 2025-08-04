// week4 : [Programmers / Backtracking] 실패율 (lv1)

package algorithm.Backtracking;

import java.util.*;

public class progBack1 {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Float> map = new HashMap<>();

        for (int i = 1; i <= N+1; i++) {
            float ja = 0;
            float mo = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) ja++;
                if (i <= stages[j]) mo++;
            }

            if (ja == 0 || mo == 0) {
                map.put(i, 0f);
            } else {
                map.put(i, ja/mo);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((o1, o2) -> Float.compare(map.get(o2), map.get(o1)));
        return list.stream().mapToInt(i->i).toArray();
    }
}
