// https://school.programmers.co.kr/learn/courses/30/lessons/12973?language=java
// 짝지어 제거하기
// 알게 된 점:
// 1. Stack stack = new Stack(); 이런식으로 선언하면 Java의 제네릭 타입으로 선언이 되어 push 또는 pop을 할때 전부 Object 타입으로 처리된다.
// 2. char -> String : String.valueOf(c), Character.toString(c)

package programmers;

import java.util.*;

public class Ex75_2 {
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
