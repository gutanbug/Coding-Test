import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] arr = new long[N];

        st = new StringTokenizer(br.readLine());

        arr[0] = Integer.parseInt(st.nextToken());
        for(int i = 1; i < N; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        long[] cnt = new long[M];
        long answer = 0;
        for(int i = 0; i < arr.length; i++) {
            int remainder =  (int) (arr[i] % M);
            if(remainder == 0) answer++;
            cnt[remainder]++;
        }

        for(int i = 0 ; i < M; i++) {
            if(cnt[i] > 1) {
                answer += cnt[i] * (cnt[i] - 1) / 2;
            }
        }
        System.out.println(answer);


    }
}
