import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int cross_count = 1, prev_sum = 0;
        while(true) {
            if (X <= cross_count + prev_sum) {
                if (cross_count % 2 == 1) {
                    System.out.print((cross_count - (X - prev_sum - 1)) + "/" + (X - prev_sum));
                    break;
                } else {
                    System.out.print((X - prev_sum) + "/" + (cross_count - (X - prev_sum - 1)));
                    break;
                }
            } else {
                prev_sum += cross_count;
                cross_count++;
            }
        }
    }
}