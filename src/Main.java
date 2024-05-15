import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(bf.readLine());
        int p = Integer.parseInt(bf.readLine());
        int[] gate = new int[g + 1];
        int[] queue = new int[p];
        for (int i = 0; i < p; i++) {
            queue[i] = Integer.parseInt(bf.readLine());
        }
        int res = 0;
        for (int i = 0; i < p; i++) {
            int cur = queue[i];
            int left = 0;
            for (int j = 1; j < cur; j++) {
                if (gate[j] == 0) {
                    left++;
                }
            }
            System.out.println("left: " + left);
            if (left == 0) {
                if (gate[cur] != 0) {
                    break;
                } else {
                    gate[cur] = cur;
                    res++;
                    System.out.println("loc: " + cur);
                    System.out.println(Arrays.toString(gate) + "\n");
                    continue;
                }

            }
            int fnt = 0;
            int bck = 0;
            for (int j = i + 1; j < p; j++) {
                if (left > 0) {
                    left--;
                    if (queue[j] <= cur) {
                        fnt++;
                    } else {
                        bck++;
                    }
                } else {
                    break;
                }
            }
            gate[fnt + 1] = cur;
            res++;
            System.out.println("fnt: " + fnt + " bck: " + bck);
            System.out.println("loc: " + (fnt + 1));
            System.out.println(Arrays.toString(gate) + "\n");
        }
        System.out.println(res);
    }

}