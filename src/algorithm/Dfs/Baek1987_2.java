package algorithm.Dfs;

import java.io.*;
import java.util.*;

public class Baek1987_2 {
    static int R, C;
    static int max = 0;
    static char[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        graph = new char[R][C];
        Set<Character> visited = new HashSet<>();

        // 그래프 작성
        for (int i = 0; i < R; i++) {
            String str = bf.readLine();
            for (int j = 0; j < C; j++) {
                graph[i][j] = str.charAt(j);
            }
        }

        dfs(0, 0, 0, visited);
        System.out.println(max);
    }

    public static void dfs(int y, int x, int count, Set<Character> visited) {
        // 길이 아닌 곳 또는 같은 알파벳 발견
        if (y >= R || y < 0 || x >= C || x < 0) {
            if (max < count) {
                max = count;
            }
            return;
        } else if (visited.contains(graph[y][x])) {
            if (max < count) {
                max = count;
            }
            return;
        }

        visited.add(graph[y][x]);
        count++;
        dfs(y-1, x, count, visited);
        dfs(y+1, x, count, visited);
        dfs(y, x+1, count, visited);
        dfs(y, x-1, count, visited);
        visited.remove(graph[y][x]);
    }
}
