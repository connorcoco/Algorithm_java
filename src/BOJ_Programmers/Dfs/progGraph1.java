// week4 : [Programmers / Graph] 광물 캐기 (lv2)

package BOJ_Programmers.Dfs;

import java.util.*;

public class progGraph1 {
    static int N;
    static int minTired = 100000;
    public int solution(int[] picks, String[] minerals) {
        if (minerals.length % 5 == 0) {
            N = minerals.length / 5;
        } else {
            N = minerals.length / 5 + 1;
        }
        int[] diaRow = new int[N];
        int[] ironRow = new int[N];
        int[] stoneRow = new int[N];

        for (int i = 0; i < minerals.length; i++) {
            int n = i / 5;

            if (minerals[i].equals("diamond")) {
                diaRow[n] += 1;
                ironRow[n] += 5;
                stoneRow[n] += 25;
            } else if (minerals[i].equals("iron")) {
                diaRow[n] += 1;
                ironRow[n] += 1;
                stoneRow[n] += 5;
            } else {
                diaRow[n] += 1;
                ironRow[n] += 1;
                stoneRow[n] += 1;
            }
        }
        int[][] graph = {diaRow, ironRow, stoneRow};
        solution2(0, picks, graph, -1);

        return minTired;
    }

    public void solution2(int tired, int[] picks, int[][] graph, int count) {
        count++;

        if(count >= N || (picks[0] == 0 && picks[1] == 0 && picks[2] == 0)) {
            minTired = Math.min(minTired, tired);
            return;
        }

        if (picks[0] > 0) {
            picks[0]--;
            tired += graph[0][count];
            solution2(tired, picks, graph, count);
        }
        if (picks[1] > 0) {
            picks[1]--;
            tired += graph[1][count];
            solution2(tired, picks, graph, count);
        }
        if (picks[2] > 0) {
            picks[2]--;
            tired += graph[2][count];
            solution2(tired, picks, graph, count);
        }
    }
}
