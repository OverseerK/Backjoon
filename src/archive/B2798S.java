package archive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class B2798S {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] ip = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int c = ip[0];
        int n = ip[1];
        int[] card = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int r = 0;
        int[] s = new int[]{0, 1, 2};
        while (true) {
            int t = card[s[0]] + card[s[1]] + card[s[2]];
            if (t > r && t <= n) {
                r = t;
            }
            if (r == n) {
                break;
            }
            if (s[2] == c - 1) {
                if (s[1] == c - 2) {
                    if (s[0] == c - 3) {
                        break;
                    }
                    s[0]++;
                    s[1] = s[0] + 1;
                } else {
                    s[1]++;
                }
                s[2] = s[1] + 1;
            } else {
                s[2]++;
            }
        }
        System.out.println(r);
    }

}