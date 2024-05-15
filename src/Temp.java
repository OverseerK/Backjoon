import java.io.*;
import java.util.stream.Stream;

public class Temp {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder r = new StringBuilder();
        for (int i : arr) {
            if (i < in[1]) {
                r.append(i).append(" ");
            }
        }
        System.out.println(r);
    }
}