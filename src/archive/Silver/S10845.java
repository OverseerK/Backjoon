package archive.Silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class S10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < t; i++) {
            String[] cmd = bf.readLine().split(" ");
            switch (cmd[0]) {
                case "push":
                    q.offer(Integer.valueOf(cmd[1]));
                    break;
                case "pop":
                    Object v = q.poll();
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
                        System.out.println(q.peek());
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        Object[] a = q.toArray();
                        System.out.println(a[a.length - 1]);
                    }
                    break;
            }
        }
    }
}