package BOJ_Programmers.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baek1449 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] locations = new int[N];
        List<LocationScope> locationScopeList = new ArrayList<>();
        
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            locations[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(locations);

        for (int i = 0; i< N; i++) {
            locationScopeList.add(new LocationScope((double)locations[i]-0.5,(double)locations[i]+0.5));
        }

        int total = 0;
        for (int i = 0; i < N; ) {
            if (i == N-1) {
                total++;
                break;
            }
            int j = i+1;
            while(locationScopeList.get(j).en - locationScopeList.get(i).st <= L) {
                j++;
                if(j >= N) break;
            }
            total++;
            i = j;
        }

        System.out.println(total);

    }
    public static class LocationScope {
        double st;
        double en;

        public LocationScope(double st, double en) {
            this.st = st;
            this.en = en;
        }
    }
}
