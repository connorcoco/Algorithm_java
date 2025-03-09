// week1 : [BOJ / Implement] 20006 (랭킹전 대기열 / 실버 2)

package BOJ_Programmers.Implementation;

import java.io.*;
import java.util.*;

public class baek20006 {
    static int roomMax;
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int playerNum = Integer.parseInt(st.nextToken());
        roomMax = Integer.parseInt(st.nextToken());

        // player 정보 받기
        ArrayList<Player> playerList = new ArrayList<>();
        for (int i = 0; i < playerNum; i++) {
            st = new StringTokenizer(bf.readLine());
            int l = Integer.parseInt(st.nextToken());
            String n = st.nextToken();
            playerList.add(new Player(l, n));
        }

        // player -> room에 넣기
        ArrayList<Room> roomList = new ArrayList<>();
        for (Player player: playerList) {
            boolean enter = false;
            if (roomList.isEmpty()) {
                roomList.add(new Room(player));
                enter = true;
                continue;
            }
            for (Room room : roomList) {
                if (!room.isStart && room.isEnter(player) && !enter) {
                    room.addPlayer(player);
                    enter = true;
                }
            }
            if (!enter) roomList.add(new Room(player));
        }

        // 출력하기
        StringBuilder sb = new StringBuilder();
        for (Room room: roomList) {
            String status = (room.isStart) ? "Started!\n" : "Waiting!\n";
            sb.append(status);

            for (Player player: room.playerList) {
                sb.append(player.level + " " + player.nickname + "\n");
            }
        }
        System.out.println(sb);
    }

    public static class Player{
        int level;
        String nickname;

        public Player(int l, String n) {
            this.level = l;
            this.nickname = n;
        }
    }

    public static class Room{
        int min;
        int max;
        boolean isStart;
        ArrayList<Player> playerList = new ArrayList<>();

        public Room(Player player) {
            this.min = (player.level-10 <= 0) ? 0 : player.level-10;
            this.max = player.level+10;
            this.isStart = false;
            this.playerList.add(player);
            if (this.playerList.size() == roomMax) {
                this.isStart = true;
            }
        }

        public void addPlayer(Player player) {
            this.playerList.add(player);
            this.playerList.sort(Comparator.comparing(p -> p.nickname));
            if (this.playerList.size() == roomMax) {
                this.isStart = true;
            }
        }

        public boolean isEnter(Player player) {
            return player.level >= this.min && player.level <= this.max;
        }
    }
}
