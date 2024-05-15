package archive;

import java.io.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.stream.Stream;

public class S1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = in[0];
        int m = in[1];
        String[] v = new String[n];
        for (int i = 0; i < n; i++) {
            v[i] = bf.readLine();
        }
        HashMap<String, Integer> sa = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            sa.put(v[i - 1], i);
        }
        for (int i = 0; i < m; i++) {
            String s = bf.readLine();
            String r;
            try {
                r = v[Integer.parseInt(s) - 1];
            } catch (NumberFormatException e) {
                r = String.valueOf(sa.get(s));
            }
            bw.write(r + "\n");
        }
        bw.flush();
    }
}
