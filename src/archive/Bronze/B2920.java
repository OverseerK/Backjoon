package archive.Bronze;

import java.util.Scanner;

public class B2920 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        if (s.equals("1 2 3 4 5 6 7 8")) {
            System.out.println("ascending");
        } else if (s.equals("8 7 6 5 4 3 2 1")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}