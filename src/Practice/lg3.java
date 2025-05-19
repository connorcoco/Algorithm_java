package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lg3 {
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