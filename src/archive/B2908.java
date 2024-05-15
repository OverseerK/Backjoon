package archive;

import java.util.Arrays;
import java.util.Scanner;

public class B2908 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] sa = sc.nextLine().split(" ");
        for (int i = 0; i < sa.length; i++) {
            String s = sa[i];
            String ns = "";
            for (int ii = s.length() - 1; ii >= 0; ii--) {
                char[] c = s.toCharArray();
                ns = ns + c[ii];
            }
            sa[i] = ns;
        }
        int[] ints = Arrays.stream(sa).mapToInt(Integer::parseInt).toArray();
        System.out.println(Math.max(ints[0], ints[1]));
    }
}