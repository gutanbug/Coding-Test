import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();
        int sum = 0;

        for (int i = M; i <= N; i++) {
            List<Integer> count = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count.add(j);
                }
            }
            if (count.size() == 2) {
                result.add(i);
            }
        }
        for (int i : result) {
            sum += i;
        }
        if (!result.isEmpty()) {
            System.out.println(sum);
            System.out.println(result.get(0));
        } else {
            System.out.println(-1);
        }
    }
}