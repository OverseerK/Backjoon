package archive;

import java.util.Scanner;
import java.util.stream.Stream;

public class B2577 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] x = Stream.of(String.valueOf(Integer.parseInt(sc.nextLine()) * Integer.parseInt(sc.nextLine()) * Integer.parseInt(sc.nextLine())).split("")).mapToInt(Integer::parseInt).toArray();
        int[] r = new int[10];
        for (int c : x) {
            r[c] = r[c] + 1;
        }
        for (int i : r) {
            System.out.println(i);
        }
    }

}