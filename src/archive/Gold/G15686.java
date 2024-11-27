package archive.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class G15686 {

    static ArrayList<boolean[]> combs = new ArrayList<>();

    static int dist(String in1, String in2) {
        int[] cord1 = Stream.of(in1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cord2 = Stream.of(in2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int x1 = cord1[0];
        int y1 = cord1[1];
        int x2 = cord2[0];
        int y2 = cord2[1];
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    static int minDist(String house, ArrayList<String> kfc) {
        int min = Integer.MAX_VALUE;
        for (String cord : kfc) {
            int dist = dist(house, cord);
            if (dist < min) {
                min = dist;
            }
        }
        return min;
    }

    static void comb(boolean[] visit, int start, int n, int r) {
        if (r == 0) {
            combs.add(visit.clone());
            return;
        }

        for (int i = start; i < n; i++) {
            visit[i] = true;
            comb(visit, i + 1, n, r - 1);
            visit[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = in[0];
        int m = in[1];

        //map input
        int[][] map = new int[n][];
        for (int i = 0; i < n; i++) {
            map[i] = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        //집과 치킨집 기록
        int ks = 0;
        ArrayList<String> house = new ArrayList<>();
        ArrayList<String> kfc = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cord = map[i][j];
                if (cord == 1) {
                    house.add(i + " " + j);
                } else if (cord == 2) {
                    ks++;
                    kfc.add(i + " " + j);
                }
            }
        }

        //치킨집 고르기
        //n = ks, r = m
        int minresult = Integer.MAX_VALUE;
        comb(new boolean[ks], 0, ks, m);
        for (boolean[] comb : combs) {
            int result = 0;
            ArrayList<String> selkfc = new ArrayList<>();
            for (int j = 0; j < kfc.size(); j++) {
                if (comb[j]) {
                    selkfc.add(kfc.get(j));
                }
            }
            for (String selhouse : house) {
                int mindist = minDist(selhouse, selkfc);
                result += mindist;
            }
            if (result < minresult) {
                minresult = result;
            }
        }
        System.out.println(minresult);
    }

}