package archive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1003 {

    static int[] n = new int[41];
    static int[] zero = new int[41];
    static int[] one = new int[41];

    static int fib(int i) {
        if (i == 0) {
            zero[0] = 1;
            return 0;
        } else if (i == 1) {
            one[1] = 1;
            return 1;
        } else {
            if (n[i] == 0) {
                n[i] = fib(i - 1) + fib(i - 2);
                zero[i] = zero[i - 1] + zero[i - 2];
                one[i] = one[i - 1] + one[i - 2];
            }
            return n[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(bf.readLine());
        for (int i = 0; i < TC; i++) {
            int in = Integer.parseInt(bf.readLine());
            fib(in);
            System.out.println(zero[in] + " " + one[in]);
        }
    }

}