import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        int i = 0;
        double max = 0;
        double average = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int j = 0; j < N; j++) {
            arr[j] = Double.parseDouble(st.nextToken());
            max = Math.max(max, arr[j]);
        }
        for (int j = 0; j < N; j++) {
            arr[j] = arr[j] / max * 100;
            average += arr[j];
        }
        System.out.println(average/arr.length);
    }
}