package archive.Silver;

import java.io.*;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class S1260 {

    static ArrayList<Integer>[] graph;
    static boolean[] visit;
    static StringBuilder s = new StringBuilder();

    static void dfs(int n) {
        s.append(n).append(" ");
        visit[n] = true;
        for (int i : graph[n]) {
            if (!visit[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visit[n] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            s.append(node).append(" ");
            for (int i : graph[node]) {
                if (!visit[i]) {
                    q.add(i);
                    visit[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = in[0];
        graph = new ArrayList[n + 1];
        visit = new boolean[n + 1];
        int m = in[1];
        int v = in[2];
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList();
        }
        for (int i = 0; i < m; i++) {
            in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = in[0];
            int b = in[1];
            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }
        dfs(v);
        Arrays.fill(visit, false);
        s.append("\n");
        bfs(v);
        System.out.println(s);
    }

}