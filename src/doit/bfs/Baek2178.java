package doit.bfs;

import java.io.*;
import java.util.*;

public class Baek2178 {
    static int N, M;
    static boolean[][] visited;
    static int[][] graph;
    static int[] dRow;
    static int[] dCol;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dRow = new int[]{-1, 1, 0, 0};
        dCol = new int[]{0, 0, -1, 1};
        visited = new boolean[N+1][M+1];
        graph = new int[N+1][M+1];

        for (int i = 1; i < N+1; i++) {
            st = new StringTokenizer(bf.readLine());
            String str = st.nextToken();
            for (int j = 1; j < M+1; j++) {
                graph[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }
        }
        bfs(1,1);
        System.out.print(graph[N][M]);
    }

    static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        visited[i][j] = true;

        while(!q.isEmpty()) {
            int[] here = q.poll();

            for (int p=0; p<4; p++) {
                int row = here[0] + dRow[p];
                int col = here[1] + dCol[p];

                if (row<1 || col<1 || row>N || col>M) continue;

                if (graph[row][col] == 1 && !visited[row][col]) {
                    q.offer(new int[]{row,col});
                    visited[row][col] = true;
                    graph[row][col] = graph[here[0]][here[1]] + 1;
                }
            }
        }
    }
}
