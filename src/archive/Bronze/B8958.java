package archive.Bronze;

import java.util.Scanner;

public class B8958 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = Integer.parseInt(sc.nextLine());
        for (int l = 0; l < TC; l++) {
            char[] chars = sc.nextLine().toCharArray();
            int r = 0;
            int streak = 0;
            for (char c : chars) {
                if (c == 'O') {
                    streak++;
                    r = r + streak;
                } else {
                    streak = 0;
                }
            }
            System.out.println(r);
        }
    }
}
