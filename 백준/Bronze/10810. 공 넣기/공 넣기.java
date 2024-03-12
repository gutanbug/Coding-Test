import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int k = Integer.parseInt(st.nextToken());

            for (int b = i; b <= j; b++) {
                arr[b] = k;
            }
        }
        for (int a = 0; a < arr.length; a++) {
            sb.append(arr[a]).append(" ");
        }
        br.close();
        System.out.println(sb);
    }
}