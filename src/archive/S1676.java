package archive;

import java.math.BigInteger;
import java.util.Scanner;

public class S1676 {

    static Scanner sc = new Scanner(System.in);

    static BigInteger factorial(BigInteger n) {
        if (n.compareTo(new BigInteger("0")) == 0) {
            return new BigInteger("1");
        } else {
            return (n.multiply(factorial(n.subtract(new BigInteger("1")))));
        }
    }

    public static void main(String[] args) {
        BigInteger n = sc.nextBigInteger();
        BigInteger i = factorial(n);
        char[] ca = i.toString().toCharArray();
        char[] ra = new char[ca.length];
        for (int in = ca.length - 1, j = 0; in >= 0; in--, j++) {
            ra[j] = ca[in];
        }
        int count = 0;
        for (char c : ra) {
            if (c == '0') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }

}