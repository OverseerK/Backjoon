package archive;

import java.util.HashMap;
import java.util.Scanner;

public class B1157 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Character, Integer> r = new HashMap<>();
        String s = sc.next().toUpperCase();
        for (char c : s.toCharArray()) {
            if (r.containsKey(c)) {
                r.put(c, r.get(c) + 1);
            } else {
                r.put(c, 1);
            }
        }
        char rc = ' ';
        int v = 0;
        boolean dup = false;
        for (char c : r.keySet()) {
            if (r.get(c) > v) {
                rc = c;
                v = r.get(c);
                dup = false;
            } else if (r.get(c) == v) {
                dup = true;
            }
        }
        if (dup) {
            System.out.println("?");
        } else {
            System.out.println(rc);
        }
    }
}