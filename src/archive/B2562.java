package archive;

import java.util.Scanner;

public class B2562 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int index = 0;
        int r = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(sc.nextLine());
            if (n > r) {
                r = n;
                index = i;
            }
        }
        System.out.println(r);
        System.out.println(index + 1);
    }
}
