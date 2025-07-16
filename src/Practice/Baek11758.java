package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek11758 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double[][] graph = new double[3][2];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(bf.readLine());
            graph[i][0] = (double)Integer.parseInt(st.nextToken());
            graph[i][1] = (double)Integer.parseInt(st.nextToken());
        }

        double value = ((graph[1][1]-graph[0][1]) / (graph[1][0]-graph[0][0])) * (graph[2][0]-graph[0][0]) + graph[0][1];
        if(value > graph[2][1]) {
            if (value > 0) {
                System.out.println(1);
            }
        }



    }
}
