package archive.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.stream.Stream;

public class S10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = in[i];
            if (map.containsKey(x)) {
                map.replace(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int m = Integer.parseInt(bf.readLine());
        in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (map.containsKey(in[i])) {
                r.append(map.get(in[i])).append(" ");
            } else {
                r.append("0").append(" ");
            }
        }
        System.out.println(r);
    }

}
