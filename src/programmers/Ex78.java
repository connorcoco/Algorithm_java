// https://school.programmers.co.kr/learn/courses/30/lessons/70129
// 이진 변환 반복하기
// 알게 된 코드:
// Integer.toBinaryString(n) -> 정수n을 이진수 문자열로 변환

package programmers;

public class Ex78 {
    int zero;
    String bin;
    public int[] solution(String s) {
        int[] answer = new int[2];
        bin = s;
        zero = 0;
        int i = 0;
        while (bin.length() > 1) {
            i++;
            toBin();
        }

        answer[1] = zero;
        answer[0] = i;
        return answer;
    }

    public void toBin() {
        int n = 0;

        for (char c: bin.toCharArray()) {
            if (c == '1') n++;
            else zero++;
        }
        bin = Integer.toBinaryString(n);
    }

//    // replaceAll을 통해 0삭제
//    public int[] solution(String s) {
//        int[] answer = new int[2];
//        int temp;
//        while( !s.equals("1") ) {
//            answer[1] += s.length();
//            s = s.replaceAll("0", "");
//            temp = s.length();
//            s = Integer.toBinaryString(temp);
//            //System.out.println("s : " + s );
//            answer[0]++;
//            answer[1] -= temp;
//        }
//        return answer;
//    }
}
