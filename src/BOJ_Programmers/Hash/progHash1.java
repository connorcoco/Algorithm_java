// week2 : [Programmers / Hash] 전화번호 목록 반복문으로 풀기 (lv2)

package BOJ_Programmers.Hash;

import java.io.*;
import java.util.*;

public class progHash1 {
    public boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (isContain(phone_book[i], phone_book[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isContain(String num1, String num2) {
        char[] charNum1 = num1.toCharArray();
        char[] charNum2 = num2.toCharArray();

        for (int i = 0; i < Math.min(charNum1.length, charNum2.length); i++) {
            if (charNum1[i] != charNum2[i]) {
                return false;
            }
        }
        return true;
    }
}
