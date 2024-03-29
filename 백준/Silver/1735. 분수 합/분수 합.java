import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n3 = Integer.parseInt(st.nextToken());
        int n4 = Integer.parseInt(st.nextToken());

        int max1 = getMax(n1, n2);
        n1 = n1 / max1;
        n2 = n2 / max1;
        int max2 = getMax(n3, n4);
        n3 = n3 / max2;
        n4 = n4 / max2;

        int max = getMax(n2, n4);

        int down = n2 * n4 / max;
        int up = (down / n2) * n1 + (down / n4) * n3;

        int last = getMax(down, up);

        down = down / last;
        up = up / last;

        System.out.println(up + " " + down);
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