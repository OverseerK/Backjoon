package archive.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class S1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> a = new LinkedList<>();
        StringBuilder s = new StringBuilder();
        s.append("<");
        int[] n = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i <= n[0]; i++) {
            a.add(i);
        }
        for (int i = 0; i < n[0] - 1; i++) {
            for (int j = 0; j < n[1]; j++) {
                if (j == n[1] - 1) {
                    s.append(a.poll()).append(", ");
                } else {
                    a.add(a.poll());
                }
            }
        }
        s.append(a.poll()).append(">");
        System.out.println(s);
    }

}
