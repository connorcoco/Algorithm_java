package doit.stackAndQueue;

import java.io.*;
import java.util.*;

public class Baek2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        Queue<Integer> cardQueue = new LinkedList<>();

        for (int i = 1; i < N+1; i++) {
            cardQueue.add(i);
        }
        int time = 0;
        while(cardQueue.size() > 1) {
            time++;
            if(time % 2 == 1) {
                cardQueue.poll();
            } else {
                cardQueue.add(cardQueue.poll());
            }
        }

        System.out.print(cardQueue.peek());
    }
}
