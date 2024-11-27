package archive.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class B4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = bf.readLine();
            if (s.equals("0 0 0")) {
                break;
            }
            int[] tri = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(tri);
            int a = tri[0];
            int b = tri[1];
            int c = tri[2];
            if (a + b > c && (a * a) + (b * b) == (c * c)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
