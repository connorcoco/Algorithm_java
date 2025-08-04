// https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java
// 최댓값과 최솟값

// 알게 된 코드 :
// string.trim().split("[\\s]"); -> 공백 기준으로 split

package programmers;

public class ex80 {
    public String solution(String s) {
        String[] strArr = s.trim().split("[\\s]");
        int min = 0;
        int max = 0;
        for (int i = 0; i < strArr.length; i++) {
            int n = Integer.parseInt(strArr[i]);

            if (i == 0)  {
                min = n;
                max = n;
            }

            if (n < min) min = n;
            else if (n > max) max = n;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        return sb.toString();
    }
}
