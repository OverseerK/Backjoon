package archive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class S1182X {

    static int fac(int a, int b) {
        int r = 1;
        for (int i = a; i <= b; i++) {
            r *= i;
        }
        return r;
    }

    static int c(int n, int r) {
        return fac(n - r + 1, n) / fac(1, r);
    }

    static int[] sel;

    static void sel(int n, int c, int l) { //������ ������ �ε��� ã�� (���� 1/�̼��� 0)
        if (l == 1) {
            sel[n]++;
        } else if (n == l - 1) {
            if (sel[n] < c - 1) {
                sel[n]++;
            } else {
                sel(n - 1, c, l);
                sel[n] = sel[n - 1] + 1;
            }
        } else if (n > 0) {
            if (sel[n] < sel[n + 1] - 1) {
                sel[n]++;
            } else {
                sel(n - 1, c, l);
                sel[n] = sel[n - 1] + 1;
            }
        } else if (n == 0) {
            if (sel[n] < sel[n + 1] - 1) {
                sel[n]++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = in[0];
        int s = in[1];
        int[] arr = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int r = 0;
        for (int l = 1; l <= arr.length; l++) { //���̰� 1���� n�� �������� �ݺ�
            sel = new int[l];
            for (int i = 0; i < l; i++) {
                sel[i] = i;
            }
            for (int i = 0; i < c(n, l); i++) { //������ ���� ���� ��� ������ ������ ã��
                int tmp = 0;
                for (int j : sel) {
                    tmp += arr[j];
                }
                if (tmp == s) {
                    r++;
                }
                sel(l - 1, n, l);
            }
        }
        System.out.println(r);
    }
}
