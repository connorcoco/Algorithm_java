package Practice;

import java.io.*;
import java.util.StringTokenizer;

//N * N개의 픽셀로 이루어진 화면이 있다. 각 픽셀은 값으로 표현된 특정 색이 주어진다. 만약 특정 색이 N * N의 과반수를 차지하면 그 화면의 색은 그 색이 된다. 그렇지 않은 경우, 모든 색의 합을 N * 2으로 나눈 값이 그 화면의 색이다(단, 소수점은 버린다). 이때 화면의 색을 구하시오.
//
//        1 < N < 100
//        1 < 색의 수 < 100
//
//예제 :
//
//        3
//        1 1 1
//        1 1 2
//        3 4 5
//
//
//답 : 1
//
//예제 2 :
//
//        4
//        1 2 3 4
//        5 6 7 8
//        9 10 11 12
//        13 14 15 16

public class lg1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] monitor = new int[N][N];
        int[] pxArr = new int[101];
        int sum = 0;

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int px = Integer.parseInt(st.nextToken());
                monitor[i][j] = px;

                pxArr[px]++;
                sum += px;

                // 과반수일 경우
                if (pxArr[px] > N/2) {
                    System.out.println(px);
                    return;
                }
            }
        }
        // 아닐 경우
        System.out.println(sum / (N*2));
    }
}
