// 프로그래머스 : 올바른 괄호 (https://school.programmers.co.kr/learn/courses/30/lessons/12909)

package practice;

class Prog1 {
    boolean solution(String s) {
        boolean answer = true;

        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') sum += 1;
            else sum += -1;

            if (sum < 0) return false;
        }

        if (sum == 0) return true;
        else return false;
    }
}
