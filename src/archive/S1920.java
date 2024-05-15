package archive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class S1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int ac = Integer.parseInt(bf.readLine());
        int[] a = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bc = Integer.parseInt(bf.readLine());
        int[] b = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
        for (int i = 0; i < bc; i++) {
            int n = Arrays.binarySearch(a, b[i]);
            if (n >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

}