package archive.Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S1181 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int c = Integer.parseInt(sc.nextLine());
        String[] s = new String[c];
        for (int i = 0; i < c; i++) {
            s[i] = sc.nextLine();
        }
        Arrays.sort(s);
        Arrays.sort(s, Comparator.comparing(String::length));
        for (int i = 0; i < c; i++) {
            if (s[i] != null) {
                for (int n = i + 1; n < c; n++) {
                    if (s[i].length() == s[n].length() && s[i].equals(s[n])) {
                        s[n] = null;
                    }
                }
            }
        }
        for (int i = 0; i < c; i++) {
            if (s[i] != null) {
                System.out.println(s[i]);
            }
        }
    }
}
