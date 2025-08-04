package algorithm.Dfs;

import java.io.*;
import java.util.*;

public class baek1987 {

    public static int M, N;
    public static int countAll = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        if(M == 1 && N == 1){
            bw.write(String.valueOf(1));
            br.close();
            bw.close();
            return;
        }
        String[] graph = new String[M];
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < M; i++){
            graph[i] = br.readLine();
        }

        dfs(graph, set, 0, 0, 0);
        bw.write(String.valueOf(countAll));
        br.close();
        bw.close();
    }

    public static void dfs(String[] graph, HashSet<Character> set, int y, int x, int count){
        if(x < 0 || x >= N || y < 0 || y >= M){
            return;
        }
        if(set.contains(graph[y].charAt(x))){
            if(countAll < count) countAll = count;
            return;
        }
        set.add(graph[y].charAt(x));
        count++;
        dfs(graph, set, y + 1, x, count);
        dfs(graph, set, y - 1, x, count);
        dfs(graph, set, y, x + 1, count);
        dfs(graph, set, y, x - 1, count);

        set.remove(graph[y].charAt(x));
    }
}
