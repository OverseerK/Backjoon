package archive.Silver;

import java.util.Arrays;
import java.util.Scanner;

public class S1018X {
//
//    static Scanner sc = new Scanner(System.in);
//
//    public static void par(int[][] arr) {
//        System.out.println();
//        for (int[] ints : arr) {
//            System.out.println(Arrays.toString(ints));
//        }
//    }
//
//    public static void main(String[] args) {
//        String[] cr = sc.nextLine().split(" ");
//        int c = Integer.parseInt(cr[0]);
//        int r = Integer.parseInt(cr[1]);
//        int[][] board = new int[c][r];
//        for (int i = 0; i < c; i++) {
//            char[] c1 = sc.nextLine().toCharArray();
//            for (int i1 = 0; i1 < r; i1++) {
//                if (c1[i1] == 'B') {
//                    board[i][i1] = 0;
//                } else {
//                    board[i][i1] = 1;
//                }
//            }
//        }
//        int cs = c - 7;
//        int rs = r - 7;
//        int newcount = cs * rs;
//
//        for (int k = 0; k < newcount; k++) {
//
//            //allboard[0] (cs*rs���� board)
//            allboard[0] = board
//            for (int hang = k / cs; hang < k / cs + 8; hang++) {
//                for (int yeul = k % rs; yeul < k % rs + 8; yeul++) {
//                    allboard[k][k / cs][k % rs] = board[k / cs][k % rs];
//                }
//            }
//
//        }
//
//        int[] res = new int[newcount];
//        for (int k = 0; k < newcount; k++) {
//            for (int i = 0; i < 8; i++) {
//                for (int i1 = 0; i1 < 8; i1++) {
//                    if (i % 2 == 1) { //Ȧ����
//                        if (i1 % 2 == 1) { //Ȧ����
//                            if (allboard[k][i][i1] == 0) {
//                                res[k]++;
//                            }
//                        } else { //¦����
//                            if (allboard[k][i][i1] == 1) {
//                                res[k]++;
//                            }
//                        }
//                    } else { //¦����
//                        if (i1 % 2 == 1) { //Ȧ����
//                            if (allboard[k][i][i1] == 1) {
//                                res[k]++;
//                            }
//                        } else { //¦����
//                            if (allboard[k][i][i1] == 0) {
//                                res[k]++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        int[] fin = new int[newcount];
//        for (int i = 0; i < newcount; i++) {
//            fin[i] = Math.min(res[i], 64 - res[i]);
//        }
//        int min = fin[0];
//        for (int i = 1; i < newcount; i++) {
//            if (fin[i] < min) {
//                min = fin[i];
//            }
//        }
//        System.out.println(min);
//    }

}
