package archive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S9012 {
    static boolean vps(String t) {
        Stack<Character> s = new Stack<>();
        char[] p = t.toCharArray();
        for (char c : p) {
            if (c == '(') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(bf.readLine());
        for (int i = 0; i < TC; i++) {
            if (vps(bf.readLine())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}