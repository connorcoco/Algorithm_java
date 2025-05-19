package BOJ_Programmers.greedy;

import java.io.*;
import java.util.*;

public class baek19598 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        List<Meeting> meetingList = new ArrayList<>();

        List<List<Meeting>> meetingRoomList = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            meetingList.add(new Meeting(start, end));
        }

        for (Meeting meeting: meetingList) {
            if (meetingRoomList.isEmpty()) {
                List<Meeting> newMeetingRoom = new ArrayList<>();
                newMeetingRoom.add(meeting);
                meetingRoomList.add(newMeetingRoom);
                continue;
            }
            fixMeeting(meeting, meetingRoomList);
        }

        System.out.println(meetingRoomList.size());
    }

    static void fixMeeting(Meeting meeting, List<List<Meeting>> meetingRoomList) {
        for (List<Meeting> meetingRoom: meetingRoomList) {
            boolean isPass = true;
            for (Meeting order: meetingRoom) {
                if (meeting.st < order.en && meeting.en > order.st) {
                    isPass = false;
                    break;
                }
            }

            if (isPass) {
                meetingRoom.add(meeting);
                return;
            } else if (meetingRoomList.indexOf(meetingRoom) == meetingRoomList.size()-1) {
                // 모든 회의룸을 돌아도 안되면 회의룸 만들기
                List<Meeting> newMeetingRoom = new ArrayList<>();
                newMeetingRoom.add(meeting);
                meetingRoomList.add(newMeetingRoom);
                return;
            }
        }

    }

    static class Meeting {
        int st;
        int en;

        Meeting(int st, int en) {
            this.st = st;
            this.en = en;
        }
    }
}
