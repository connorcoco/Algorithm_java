// week4 : [Programmers / Backtracking] 행렬의 곱셈 (lv2)

package BOJ_Programmers.Backtracking;

public class progBack2 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;
        int n = arr2[0].length;
        int[][] answer = new int[row][n];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = solution2(i, j, col, arr1, arr2);
            }
        }
        return answer;
    }

    public int solution2(int a, int b, int M, int[][] arr1, int[][] arr2) {
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum = sum + (arr1[a][i] * arr2[i][b]);
        }
        return sum;
    }
}
