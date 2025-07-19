package doit.dfs;

import java.util.*;
import java.io.*;

public class Baek11724 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        for (int i = 1; i < n+1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 1; i < m+1; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            if (visited[i]) continue;

            dfs(i);
            answer++;
        }

        System.out.print(answer);
    }

    public static void dfs(int i) {
        if (visited[i]) return;
        visited[i] = true;
        for (int v: graph[i]) {
            dfs(v);
        }
    }
}
