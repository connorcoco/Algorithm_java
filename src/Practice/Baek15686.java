// 백준 치킨배달 (실패)

package Practice;

import java.io.*;
import java.util.*;

public class Baek15686 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Point> homeList = new ArrayList<>();
        List<Point> chickenList = new ArrayList<>();

        for (int i = 1; i < N+1; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j < N+1; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n == 1) {
                    homeList.add(new Point(j,i));
                } else if (n == 2) {
                    chickenList.add(new Point(j,i));
                }
            }
        }

        // 각 치킨집의 최소 치킨 거리 구하기
        for (Point chicken: chickenList) {
            for (Point home: homeList) {
                int d = chicken.getDistance(home);
                if (d < chicken.min) {
                    chicken.setMin(d);
                }
            }
        }
        chickenList.sort((a, b) -> a.min - b.min);

        // 남은 치킨집으로 각 집의 치킨거리 구하기
        int sum = 0;
        for (Point home: homeList) {
            for (int i = 0; i < M; i++) {
                int d = home.getDistance(chickenList.get(i));
                if (d < home.min) {
                    home.setMin(d);
                }
            }
            sum += home.min;
        }
        System.out.println(sum);
    }

    public static class Point {
        int x;
        int y;
        int min;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.min = 100;
        }

        public void setMin(int d) {
            this.min = d;
        }

        public int getDistance(Point chicken) {
            return Math.abs(this.x-chicken.x) + Math.abs(this.y-chicken.y);
        }
    }
}

