package archive.Silver;

import java.util.Scanner;
import java.util.stream.Stream;

public class S1978 {
    static Scanner sc = new Scanner(System.in);

    static boolean prime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int TC = Integer.parseInt(sc.nextLine());
        int[] primes = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int r = 0;
        for (int i = 0; i < TC; i++) {
            if (prime(primes[i])) {
                r++;
            }
        }
        System.out.println(r);
    }
}
