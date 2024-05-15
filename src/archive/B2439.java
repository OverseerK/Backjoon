package archive;

import java.util.Scanner;

public class B2439 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int i1 = 1; i1 <= n - i; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
