// https://school.programmers.co.kr/learn/courses/30/lessons/131127
// 할인 행사

package programmers;
import java.util.*;
public class Ex69 {
    public int solution(String[] want, int[] number, String[] discount) {

        Map<String, Integer> wants = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            wants.put(want[i], number[i]);
        }


        int answer = 0;

        for (int i = 0; i <= discount.length-10; i++) {
            Map<String, Integer> copy = new HashMap<>();
            copy.putAll(wants);

            for (int j = i; j < i+10; j++) {
                if (copy.containsKey(discount[j])) {
                    copy.put(discount[j], copy.get(discount[j])-1);
                    if (copy.get(discount[j]) == 0) {
                        copy.remove(discount[j]);
                    }
                }
            }
            if (copy.size()==0) {
                answer++;
            }
        }
        return answer;
    }
}
