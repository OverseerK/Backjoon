package archive.Silver;

import java.io.*;
import java.util.Stack;

public class S10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < t; i++) {
            String[] cmd = bf.readLine().split(" ");
            switch (cmd[0]) {
                case "push":
                    s.push(Integer.valueOf(cmd[1]));
                    break;
                case "pop":
                    if (s.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(s.peek());
                        s.pop();
                    }
                    break;
                case "size":
                    System.out.println(s.size());
                    break;
                case "empty":
                    if (s.empty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "top":
                    if (s.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(s.peek());
                    }
                    break;
            }
        }
    }
}