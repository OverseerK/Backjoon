package archive;

import java.io.*;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;

public class S2512 {

    static int bud;

    static boolean check(int[] arr, int max) {
        int sum = 0;
        for (int i : arr) {
            sum += Math.min(i, max);
        }
        return sum <= bud;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] q = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bud = Integer.parseInt(bf.readLine());
        if (Arrays.stream(q).sum() <= bud) {
            System.out.println(Arrays.stream(q).max().getAsInt());
        } else {
            Arrays.sort(q);
            int lo = 0;
            int hi = q[n - 1];
            while (lo + 1 < hi) {
                int mid = (lo + hi) / 2;
                if (check(q, mid)) {
                    lo = mid;
                } else {
                    hi = mid;
                }
            }
            System.out.println(lo);
        }
    }

}