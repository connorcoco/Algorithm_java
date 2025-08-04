// week6 : [Programmers / Sort] 가장 큰 수 (lv2)

package algorithm.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class progSort1 {
    public String solution(int[] numbers) {
        int n = numbers.length;

        List<NumberStr> numbersStr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(numbers[i] >= 1000) {
                numbersStr.add(new NumberStr(String.valueOf(numbers[i]), 0));
            } else if (numbers[i] >= 100) {
                numbersStr.add(new NumberStr(String.valueOf(numbers[i]*10), 1));
            } else if (numbers[i] >= 10) {
                numbersStr.add(new NumberStr(String.valueOf(numbers[i]*100), 2));
            } else if (numbers[i] > 0){
                numbersStr.add(new NumberStr(String.valueOf(numbers[i]*1000), 3));
            } else {
                numbersStr.add(new NumberStr("0000", -1));
            }
        }

        Collections.sort(numbersStr);
        StringBuilder answer = new StringBuilder();

        for (NumberStr numStr: numbersStr) {
            if (numStr.digits == -1) {
                answer.append("0");
                continue;
            }
            answer.append((int)(Integer.parseInt(numStr.numStr) / Math.pow(10,numStr.digits)));
        }
        return String.valueOf(answer);
    }

    static class NumberStr implements Comparable<NumberStr>{

        String numStr;
        int digits;

        NumberStr(String num, int digits) {
            this.numStr = num;
            this.digits = digits;
        }

        @Override
        public int compareTo(NumberStr o) {
            return Integer.parseInt(o.numStr) - Integer.parseInt(this.numStr);
        }
    }
}
