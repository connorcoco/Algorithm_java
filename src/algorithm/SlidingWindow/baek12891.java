// DNA 비밀번호

package algorithm.SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek12891 {
    static int[] checkArr;
    static int[] myArr;
    static int checkCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        char[] dnaArr = bf.readLine().toCharArray();
        checkArr = new int[4];
        myArr = new int[4];
        checkCnt = 0;

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) checkCnt++;
        }

        for (int j = 0; j < P; j++){
            addMyArr(dnaArr[j]);
        }
    }

    private static void addMyArr(char c){
        switch(c) {
            case 'A' : {
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkCnt++;
                break;
            }
            case 'C' : {
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkCnt++;
                break;
            }
            case 'G' : {
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkCnt++;
                break;
            }
            case 'T' : {
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkCnt++;
                break;
            }
        }
    }
}
