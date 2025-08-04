package algorithm.Bfs;

import java.io.*;
import java.util.*;
public class baek2178 {

    public static int N, M;
    public static ArrayList<Integer> count = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        int[][] graph = new int[M][N];
        boolean[][] visited = new boolean[M][N];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < M; i++){
            String[] str = br.readLine().split("");
            for(int j = 0; j < N; j++){
                graph[i][j] = Integer.parseInt(str[j]);
            }
        }

        q.offer(new int[]{0, 0});
        while(!q.isEmpty()){
            int[] point = q.poll();
            bfs(graph, visited, q, point[0] + 1, point[1], graph[point[0]][point[1]]);
            bfs(graph, visited, q, point[0], point[1] + 1, graph[point[0]][point[1]]);
            bfs(graph, visited, q, point[0] - 1, point[1], graph[point[0]][point[1]]);
            bfs(graph, visited, q, point[0], point[1] - 1, graph[point[0]][point[1]]);
        }

        bw.write(String.valueOf(graph[M-1][N-1]));
        br.close();
        bw.close();
    }

    public static void bfs(int[][] graph, boolean[][] visited, Queue<int[]> q, int y, int x, int before){
        if(y < 0 || y >= M || x < 0 || x >= N){
            return;
        }
        if(visited[y][x]){
            return;
        }
        if(graph[y][x] == 0){
            return;
        }

        visited[y][x] = true;
        graph[y][x] = before + 1;
        q.offer(new int[]{y, x});
    }
}

