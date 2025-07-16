package doit.stackAndQueue;

import java.io.*;
import java.util.*;

public class Baek11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>((n1,n2)->{
           int abs1 = Math.abs(n1);
           int abs2 = Math.abs(n2);

           if (abs1 == abs2) {
               return n1 < n2 ? -1 : 1;
           }

           return abs1 - abs2;
        });
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (q.size() == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(q.poll());
                }
            } else {
                q.add(x);
            }
        }
    }
}
