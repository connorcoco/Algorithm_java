// week2 : [Programmers / Hash] 전화번호 목록 해시로 풀기 (lv2)

package BOJ_Programmers.Hash;

import java.util.*;

public class progHash1_2 {
    public boolean solution(String[] phone_book) {

        // 검색 효율을 올리기 위해 Hash에 저장
        HashMap<String, Integer> phoneMap = new HashMap<>();
        for (String phone: phone_book) {
            phoneMap.put(phone, 1);
        }

        for (String phone: phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                String sub = phone.substring(0,i);
                if (phoneMap.containsKey(sub)) {
                    return false;
                }
            }
        }
        return true;
    }
}
