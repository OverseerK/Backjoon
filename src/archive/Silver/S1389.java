package archive.Silver;

import java.io.*;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class S1389 {
    static ArrayList<Integer>[] graph;
    static boolean[] visit;

    static int bfs(int n, int r) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {n, 0});
        visit[n] = true;
        while (!q.isEmpty()) {
            int[] in = q.poll();
            int node = in[0];
            int depth = in[1];
            for (int i : graph[node]) {
                if (i == r) {
                    return depth + 1;
                }
                if (!visit[i]) {
                    q.add(new int[] {i, depth + 1});
                    visit[i] = true;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = in[0];
        graph = new ArrayList[n + 1];
        visit = new boolean[n + 1];
        int m = in[1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList();
        }
        for (int i = 0; i < m; i++) {
            in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = in[0];
            int b = in[1];
            graph[a].add(b);
            graph[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }
        int min = Integer.MAX_VALUE;
        int minnum = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int bacon = 0;
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    int dist = bfs(i, j);
                    bacon += dist;
                    Arrays.fill(visit, false);
                }
            }
            if (bacon < minnum) {
                min = i;
                minnum = bacon;
            }
        }
        System.out.println(min);
    }
}