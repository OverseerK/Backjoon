package archive.Bronze;

import java.util.Scanner;

public class B2675 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < TC; t++) {
            String[] l = sc.nextLine().split(" ");
            int c = Integer.parseInt(l[0]);
            char[] s = l[1].toCharArray();
            StringBuilder r = new StringBuilder();
            for (char v : s) {
                r.append(Character.toString(v).repeat(c));
            }
            System.out.println(r);
        }
    }
}