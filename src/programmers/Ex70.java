// https://school.programmers.co.kr/learn/courses/30/lessons/12981
// 영어 끝말잇기

package programmers;

import java.util.*;
// 1번부터 n번까지의 사람이 끝말잇기를 한다.
// 조건 3개
// 1. 앞사람의 단어 마지막 글자로 시작하는 단어
// 2. 중복 금지
// 3. 문자열의 길이 > 1
// 얼마나 게임을 진행했는지를 기록해서 반환 (탈락한 사람의 번호, 차례)
// -> k번 게임이 진행됐다고 했을 때 k % n : 탈락한 사람의 번호, k / n : 차례
public class Ex70 {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        HashSet<String> report = new HashSet<>();

        // 첫 사람이 탈락했을 경우
        if (words[0].length() > 1) {
            report.add(words[0]);
        } else {
            return new int[]{1, 1};
        }

        for (int i = 1; i < words.length; i++) {
            boolean isPass = true;
            char rear = words[i-1].charAt(words[i-1].length()-1);

            // 1번 조건
            if (words[i].charAt(0) != rear) isPass = false;
                // 2번 조건
            else if (report.contains(words[i])) isPass = false;
                // 3번 조건
            else if (words[i].length() <= 1) isPass = false;

            if (isPass) {
                report.add(words[i]);
            } else {
                return new int[]{i%n+1, i/n+1};
            }
        }

        return new int[]{0, 0};
    }
}
