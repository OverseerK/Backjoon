package archive.Bronze;

import java.util.Scanner;

public class B1259 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] s;
        boolean r;
        while (true) {
            r = true;
            s = sc.nextLine().toCharArray();
            int l = s.length;
            if (l == 1) {
                if (Character.getNumericValue(s[0]) == 0) {
                    break;
                }
            } else if (l % 2 == 0) {
                for (int i = 0; i < l / 2; i++) {
                    if (s[i] != s[l - i - 1]) {
                        r = false;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < (l - 1) / 2; i++) {
                    if (s[i] != s[l - i - 1]) {
                        r = false;
                        break;
                    }
                }
            }
            if (r) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
