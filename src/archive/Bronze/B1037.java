package archive.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class B1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] div = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(div);
        int l = div.length;
        int r = l % 2 == 0 ? div[l/2] * (div[l/2 - 1]) : div[l/2] * div[l/2];
        System.out.println(r);
    }

}
