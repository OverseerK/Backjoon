package archive;

import java.util.ArrayList;
import java.util.Scanner;

public class B3052 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = Integer.parseInt(sc.nextLine());
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (!a.contains(n[i] % 42)) {
                a.add(n[i] % 42);
            }
        }
        System.out.println(a.size());
    }
}
