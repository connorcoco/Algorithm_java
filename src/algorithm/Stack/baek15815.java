// week1 : [BOJ / Stack] 15815 (천재 수학자 성필 / 실버 3)

package algorithm.Stack;

import java.util.*;

public class baek15815 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();

        Stack<Integer> stackInt = new Stack<>();

        for (char c: input) {
            if (Character.isDigit(c)) {
                stackInt.push(Integer.parseInt(String.valueOf(c)));
            } else {
                if (c == '+') {
                    int a = stackInt.pop();
                    int b = stackInt.pop();
                    stackInt.push(b + a);
                } else if (c == '-'){
                    int a = stackInt.pop();
                    int b = stackInt.pop();
                    stackInt.push(b - a);
                } else if (c == '*'){
                    int a = stackInt.pop();
                    int b = stackInt.pop();
                    stackInt.push(b * a);
                } else {
                    int a = stackInt.pop();
                    int b = stackInt.pop();
                    stackInt.push(b / a);
                }
            }
        }
        System.out.println(stackInt.pop());
    }
}
