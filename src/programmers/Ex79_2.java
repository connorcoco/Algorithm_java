// https://school.programmers.co.kr/learn/courses/30/lessons/12951
// JadenCase 문자열 만들기

package programmers;

public class Ex79_2 {
    public String solution(String s) {
        String lower = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        boolean isStart = true;

        for (char c : lower.toCharArray()) {
            if (isStart && c != ' ') {
                sb.append(Character.toUpperCase(c));
                isStart = false;
            } else {
                sb.append(c);
                if (c == ' ') isStart = true;
                else isStart = false;
            }
        }

        return sb.toString();
    }

    public String solution2(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean first = true;

        for(String ss : sp) {
            answer += first ? ss.toUpperCase() : ss;
            first = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}
