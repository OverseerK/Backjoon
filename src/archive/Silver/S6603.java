package archive.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class S6603 {

    static int fac(int a, int b) {
        int r = 1;
        for (int i = a; i <= b; i++) {
            r *= i;
        }
        return r;
    }

    static int c(int n, int r) {
        return fac(n - r + 1, n) / fac(1, r);
    }

    static int[] sel;

    static void sel(int n, int c) {
        if (n == 5) {
            if (sel[n] < c - 1) {
                sel[n]++;
            } else {
                sel(n - 1, c);
                sel[n] = sel[n - 1] + 1;
            }
        } else if (n > 0) {
            if (sel[n] < sel[n + 1] - 1) {
                sel[n]++;
            } else {
                sel(n - 1, c);
                sel[n] = sel[n - 1] + 1;
            }
        } else if (n == 0) {
            if (sel[n] < sel[n + 1] - 1) {
                sel[n]++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (in[0] == 0) {
                break;
            } else {
                int c = in[0];
                int[] s = new int[c];
                System.arraycopy(in, 1, s, 0, c);
                sel = new int[]{0, 1, 2, 3, 4, 5};
                for (int i = 0; i < c(c, 6); i++) {
                    sb.append(s[sel[0]]).append(" ").append(s[sel[1]]).append(" ").append(s[sel[2]]).append(" ").append(s[sel[3]]).append(" ").append(s[sel[4]]).append(" ").append(s[sel[5]]).append("\n");
                    sel(5, c);
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

}