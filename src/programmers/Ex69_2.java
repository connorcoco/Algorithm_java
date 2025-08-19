package programmers;

import java.util.*;

// String을 회전시키면서 검사를 해야한다.
// 회전시키는건 Queue나 리스트를 통해서 할 수 있지만 이건 빼고 넣는 것을 반복해야하기 때문에 성능적으로 안좋다.
// 인덱스만 움직이게 하는건 어떨까?
// 이중 for문을 사용해서 0~size-1, 1~0, 2~1, 3~2 ..., size-1~size-2
// 검사 로직은 Stack을 이용
public class Ex69_2 {
    public int solution(String s) {
        int answer = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            Stack<Character> stack = new Stack<>();

            for (int j = i; j < i+size; j++) {
                int index = j%size;

                // 집어 넣는 상황
                if (s.charAt(index) == '{' || s.charAt(index) == '[' || s.charAt(index) == '(') {
                    stack.push(s.charAt(index));
                } else { // 빼는 상황
                    // 빼야 하는데 비어있으므로 실패 -> 스택 하나 집어넣고 break
                    if (stack.isEmpty()) {
                        stack.push(s.charAt(index));
                        break;
                    }
                    char p = stack.peek();
                    char c = s.charAt(index);
                    // 짝이 맞으면 pop
                    if ((p == '{' && c == '}')
                            || (p == '(' && c == ')')
                            || (p == '[' && c == ']')) {
                        stack.pop();
                    } else { // 빼야 하는데 안맞으면 break
                        break;
                    }
                }
            }
            // stack이 비어 있으면 올바른 괄호
            if (stack.isEmpty()) answer++;
        }

        return answer;
    }
}
