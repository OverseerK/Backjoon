package archive.Silver;

import java.io.*;
import java.util.Arrays;

public class S2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(bf.readLine());
        int[] ints = new int[c];
        for (int i = 0; i < c; i++) {
            ints[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(ints);
        ints = Arrays.stream(ints).distinct().toArray();
        for (int i = 0; i < c; i++) {
            bw.write(ints[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}