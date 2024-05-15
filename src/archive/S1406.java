package archive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S1406 {

    static StringBuilder res(Stack<Character> front, Stack<Character> back) {
        StringBuilder r = new StringBuilder();
        for (Character ch : front) {
            r.append(ch);
        }
        StringBuilder b = new StringBuilder();
        for (Character ch : back) {
            b.append(ch);
        }
        b.reverse();
        return r.append(b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> front = new Stack<>();
        Stack<Character> back = new Stack<>();
        for (Character ch : bf.readLine().toCharArray()) {
            front.push(ch);
        }
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = bf.readLine().split(" ");
            switch (s[0]) {
                case "L":
                    if (front.size() > 0) {
                        back.push(front.pop());
                    }
                    break;
                case "D":
                    if (back.size() > 0) {
                        front.push(back.pop());
                    }
                    break;
                case "B":
                    if (front.size() > 0) {
                        front.pop();
                    }
                    break;
                case "P":
                    front.push(s[1].charAt(0));
                    break;
            }
        }
        System.out.println(res(front, back));
    }

}
