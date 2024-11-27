package archive.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class S18917 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(bf.readLine());
        long sum = 0;
        long xor = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TC; i++) {
            int[] s = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            switch (s[0]) {
                case 1:
                    sum += s[1];
                    xor ^= s[1];
                    break;
                case 2:
                    sum -= s[1];
                    xor ^= s[1];
                    break;
                case 3:
                    sb.append(sum).append('\n');
                    break;
                case 4:
                    sb.append(xor).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

}
