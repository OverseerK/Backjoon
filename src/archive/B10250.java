package archive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class B10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(bf.readLine());
        for (int i = 0; i < tc; i++) {
            int[] ip = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int h = ip[0];
            int n = ip[2];
            int y = n % h;
            int x = h == 1 ? n + 1 : n / h + 1;
            if (y == 0) {
                y = h;
                x -= 1;
            }
            String r = String.valueOf(x);
            if (r.length() == 1) {
                r = "0" + r;
            }
            System.out.println(y + r);
        }
    }

}