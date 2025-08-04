// week1 : [BOJ / Implement] 14719 (빗물 / 골드 5)

package algorithm.Implementation;

import java.util.*;
import java.io.*;

public class baek14719 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        // 각 블록의 높이 입력
        int[] blockArr = new int[w];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < w; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp <= h) {
                blockArr[i] = temp;
            }
        }

        // 빗물이 생기는 리스트 분할
        List<Field> fieldList = new ArrayList<>();
        boolean isFull = true;
        for (int j = 1; j < w; j++) {
            // Field 생성
            if (blockArr[j] < blockArr[j-1] && isFull) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(blockArr[j-1]);
                arrayList.add(blockArr[j]);
                fieldList.add(new Field(blockArr[j-1], arrayList));
                isFull = false;
            } else if (!isFull) {
                // Field에 넣기
                if (fieldList.get(fieldList.size()-1).first > blockArr[j]) {
                    fieldList.get(fieldList.size()-1).add(blockArr[j]);
                // Field 닫기
                } else if (fieldList.get(fieldList.size()-1).first <= blockArr[j]) {
                    fieldList.get(fieldList.size()-1).add(blockArr[j]);
                    fieldList.get(fieldList.size()-1).setFull();
                    isFull = true;
                }
            }
        }

        // 빗물 계산
        int sum = 0;
        for (Field field: fieldList) {
            // Field가 닫히지 않았을 경우는 패스
            if (!field.isFull && !field.isPool) continue;

            // Field를 정렬 후 두번째로 큰 수 기준으로 빗물 측정
            Collections.sort(field.blockList);
            for (int k = 0; k < field.blockList.size()-2; k++) {
                int comp = field.blockList.get(field.blockList.size() - 2);
                sum = sum + (comp - field.blockList.get(k));
            }
        }
        System.out.println(sum);
    }

    public static class Field {
        int first;
        boolean isFull;
        boolean isPool;
        List<Integer> blockList = new ArrayList<>();

        public Field(int first, List<Integer> blockList) {
            this.first = first;
            this.isFull = false;
            this.isPool = false;
            for (int block: blockList) {
                this.add(block);
            }
        }

        public void add(int block) {
            if (!this.blockList.isEmpty()) {
                if(this.blockList.get(this.blockList.size()-1) < block) {
                    isPool = true;
                }
            }

            this.blockList.add(block);
        }

        public void setFull() {
            this.isFull = true;
        }
    }
}
