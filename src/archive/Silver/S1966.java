package archive.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class S1966 {

    static int max(Queue<Integer> q) {
        int r = 0;
        for (int i : q) {
            if (i > r) {
                r = i;
            }
        }
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        for (int tc = 0; tc < m; tc++) {
            int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int initalSize = in[0];
            int resultInitalIdx = in[1];
            Queue<Integer> queue = new LinkedList<>();
            in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < initalSize; i++) {
                queue.add(in[i]);
            }
            int max = max(queue);
            int printcount = 0;
            while (true) {
                int cur = queue.poll();
                if (cur < max) { //�߿䵵 ����
                    queue.add(cur);
                    if (resultInitalIdx == 0) { //�ñ��� ������ �ڷ� ������
                        resultInitalIdx = queue.size() - 1;
                    } else { //�ñ��� ������ ������ �и�
                        resultInitalIdx--;
                    }
                } else { //�߿䵵 �������
                    max = max(queue); //�ּڰ� �ʱ�ȭ
                    printcount++;
                    if (resultInitalIdx == 0) { //�ñ��� ������ ������
                        System.out.println(printcount);
                        break;
                    } else {
                        resultInitalIdx--;
                    }
                }
            }
        }
    }

}
