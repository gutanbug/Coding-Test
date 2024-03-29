import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int max = getMax(A,B);
            sb.append(A * B / max).append("\n");
        }

        System.out.println(sb);
    }
    public static int getMax(int a, int b) {
        while(b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}