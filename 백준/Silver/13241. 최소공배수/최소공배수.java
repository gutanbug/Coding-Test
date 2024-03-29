import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long max = getMax(A,B);

        System.out.println(A * B / max);
    }

    public static long getMax(long a, long b) {

        while(b != 0) {
            long r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}