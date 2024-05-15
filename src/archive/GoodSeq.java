import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodSeq {

    static boolean check(String s) {
        //if n = 9 -> length = 1~4까지 체크
        //1 1 1 1 1 1 1 1 1
        //0 1 2 3 4 5 6 7 8
        //length = 9
        int length = s.length();
        for (int l = 1; l < length / 2; l++) {
            for (int start = 0; start < length - l - 1; start++) {
                if (s.substring(start, start + l).equals(s.substring(start + l, start + l + l))) {
                    System.out.println(s.substring(start, start + l) + " = " + s.substring(start + l, start + l + l));
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        check("123456789");
    }
}