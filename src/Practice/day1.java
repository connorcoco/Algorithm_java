package Practice;

import java.io.*;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) throws IOException {
        e1();
    }

    public static void e1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bf.readLine());
    }

    public static void e2() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void e3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = br.readLine().split(" ");
        String str = parts[0];
        int n = Integer.parseInt(parts[1]);

        for (int i = 0; i < n; i++) {
            bw.write(str);
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void e4(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] cArr = a.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : cArr){
            if (Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
