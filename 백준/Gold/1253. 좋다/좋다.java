import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        for(int i = 0 ;i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int cnt = 0;
        for(int i = 0; i < N; i++) {
            int result = arr[i];
            int start_idx = 0;
            int end_idx = N-1;

            while(start_idx < end_idx) {
                if (arr[start_idx] + arr[end_idx] == result) {
                    if (i != start_idx && i != end_idx) {
                        cnt++;
                        break;
                    } else if (i == start_idx) {
                        start_idx++;
                    } else {
                        end_idx--;
                    }
                } else if (arr[start_idx] + arr[end_idx] < result) {
                    start_idx++;
                } else {
                    end_idx--;
                }
            }
        }
        System.out.println(cnt);
    }
}
