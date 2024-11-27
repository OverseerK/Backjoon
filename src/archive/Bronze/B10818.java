package archive.Bronze;

import java.util.Scanner;
import java.util.stream.Stream;

public class B10818 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int c = Integer.parseInt(sc.nextLine());
        int[] ints = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
