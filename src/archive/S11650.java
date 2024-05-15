package archive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class S11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] list = new int[n][2];
        for (int i = 0; i < n; i++) {
            int[] s = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list[i][0] = s[0];
            list[i][1] = s[1];
        }
        Arrays.sort(list, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(list[i][0]).append(" ").append(list[i][1]).append("\n");
        }
        System.out.println(s);
    }

}