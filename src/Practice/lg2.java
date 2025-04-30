package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//A 쿠폰과 B 쿠폰이 있다. A 쿠폰은 물건의 가격이 A의 두배 이상일때, A만큼 할인해준다. B 쿠폰은 금액과 상관없이 B% 할인해준다. 이때 총 금액이 최소가 되도록 하라. 첫 줄에 물건의 개수 N, A, B가 주어지고, 그 다음부터는 물건의 가격들이 나열된다. 각 쿠폰은 N개 이상 있다.
//
//100 < 물건의 가격 < 100,000
//
//예제 1 :
//
//        3 1000 15
//        2000
//        10000
//        3000
//
//
//답 : 11500

public class lg2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double sum = 0;

        for (int i = 0; i < N; i++) {
            double select;
            double price = Integer.parseInt(br.readLine());

            if (price >= A*2) {
                select = Math.min(price-A, (price * (1 - (B/100))));
            } else {
                select = (price * (1 - (B/100)));
            }
            sum += select;
        }

        System.out.println(sum);
    }
}
