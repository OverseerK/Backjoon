package archive;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class S10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < t; i++) {
            String[] cmd = bf.readLine().split(" ");
            switch (cmd[0]) {
                case "push_front":
                    q.addFirst(Integer.valueOf(cmd[1]));
                    break;
                case "push_back":
                    q.addLast(Integer.valueOf(cmd[1]));
                    break;
                case "pop_front":
                    Object v = q.pollFirst();
                    if (v == null) {
                        System.out.println("-1");
                    } else {
                        System.out.println(v);
                    }
                    break;
                case "pop_back":
                    v = q.pollLast();
                    if (v == null) {
                        System.out.println("-1");
                    } else {
                        System.out.println(v);
                    }
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "front":
                    if (q.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(q.getFirst());
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(q.getLast());
                    }
                    break;
            }
        }
    }
}