// week1 : [BOJ / Stack] 1874 (스택 수열 / 실버 2)

package algorithm.Stack;

import java.io.*;
import java.util.*;

public class baek1874 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        int temp = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int N = Integer.parseInt(bf.readLine());

            for ( ; temp <= N; temp++) {
                stack.push(temp);
                sb.append("+\n");
            }

            // 스택의 top과 수열 값이 같다면 pop
            if (N == stack.peek()) {
                stack.pop();
                sb.append("-\n");
            // 같지 않다면 NO
            } else {
                System.out.print("NO");
                return;
            }
        }

        System.out.print(sb);
    }
}
