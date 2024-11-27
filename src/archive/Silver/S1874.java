package archive.Silver;

import java.io.*;
import java.io.IOException;
import java.util.Stack;

public class S1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(bf.readLine());
        int[] seq = new int[c];
        for (int i = 0; i < c; i++) {
            seq[i] = Integer.parseInt(bf.readLine());
        }
        int max = 0;
        Stack<Integer> st = new Stack<>();
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= seq[0]; i++) {
            st.push(i);
            max = i;
            s.append("+").append("\n");
        }
        for (int i = 0; i < c; i++) {
            if (seq[i] <= max) {
                if (st.contains(seq[i])) {
                    st.pop();
                    s.append("-").append("\n");
                } else {
                    s = new StringBuilder().append("NO");
                    break;
                }
            } else if (seq[i] > max) {
                for (int j = max + 1; j <= seq[i]; j++) {
                    st.push(j);
                    max = j;
                    s.append("+").append("\n");
                }
                st.pop();
                s.append("-").append("\n");
            }
        }
        System.out.println(s);
    }

}