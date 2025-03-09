// week1 : [BOJ / Implement] 1138 (한 줄로 서기 / 실버 2)

package BOJ_Programmers.Implementation;

import java.io.*;
import java.util.*;

public class baek1138 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = new int[n+1];
        for (int j = 1; j < n+1; j++) {
            List<Integer> temp = new ArrayList<>();
            int order = arr[j]+1;
            for (int k = 1; k < n+1; k++) {
                if (answer[k] == 0) {
                    temp.add(k);
                }
            }
            answer[temp.get(order-1)] = j;
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 1; k < n+1; k++) {
            sb.append(answer[k]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
