package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek24445 {
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 정점 수
        N = Integer.parseInt(st.nextToken());
        // 간선 수
        M = Integer.parseInt(st.nextToken());
        // 시작점
        int R = Integer.parseInt(st.nextToken());

        ArrayList<int[]> line = new ArrayList<>();
        LinkedHashSet<Integer> answer = new LinkedHashSet<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            line.add(new int[]{u,v});
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(R);
        while (!q.isEmpty()) {
            bfs(line, q, answer);
        }

        for (int a: answer) {
            System.out.println(a);
        }

    }

    static void bfs(ArrayList<int[]> line, Queue<Integer> q, LinkedHashSet<Integer> answer) {
        int R = q.poll();
        answer.add(R);

        ArrayList<Integer> near = new ArrayList<>();
        for (int i = 0; i < line.size(); i++) {
            for (int j = 0; j < 2; j++) {
                if (line.get(i)[j] == R) {
                    near.add(line.get(i)[1-j]);
                }
            }
        }
        for (int j = 0; j < near.size(); j++) {
            if (!answer.contains(near.get(j))) {
                continue;
            } else {
                near.remove(j);
            }
        }

        Collections.sort(near, (i1, i2) -> i2.compareTo(i1));

        for (int p: near) {
            q.add(p);
        }
    }
}
