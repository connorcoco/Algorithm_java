// Comparator

package doit.sort;

import java.io.*;
import java.util.*;

public class Baek10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        ArrayList<HashMap<String, String>> members = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            HashMap<String, String> member = new LinkedHashMap<>();
            st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            member.put("name", name);
            member.put("age", age);
            members.add(member);
        }

        Collections.sort(members, (o1,o2)->{
            int a1 = Integer.parseInt(o1.get("age"));
            int a2 = Integer.parseInt(o2.get("age"));
            return a1-a2;
        });

        for (HashMap<String, String> mem: members) {
            System.out.println(mem.get("age") + " " + mem.get("name"));
        }
    }
}
