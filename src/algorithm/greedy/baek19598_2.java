//package BOJ_Programmers.greedy;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class baek19598_2 {
//    static int answer = 0;
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bf.readLine());
//
//        List<Meeting> meetingList = new ArrayList<>();
//
//        StringTokenizer st;
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(bf.readLine());
//            int start = Integer.parseInt(st.nextToken());
//            int end = Integer.parseInt(st.nextToken());
//
//            meetingList.add(new Meeting(start, end));
//        }
//
//        Collections.sort(meetingList, (a,b) -> {
//           if (a.st == b.st) return a.en - b.en;
//           return a.st - b.st;
//        });
//
//        while (!meetingList.isEmpty()) {
//            fixMeeting(meetingList);
//        }
//
//        System.out.println(answer);
//    }
//
//    static void fixMeeting(List<Meeting> meetingList) {
//        for (int i = 0; i < meetingList.size(); i++) {
//        }
//        answer++;
//    }
//
//    static class Meeting {
//        int st;
//        int en;
//
//        Meeting(int st, int en) {
//            this.st = st;
//            this.en = en;
//        }
//    }
//}
