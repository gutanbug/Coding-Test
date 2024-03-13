import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine(), " ");
            int loopCount = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            String[] split = word.split("");

            for (String s : split) {
                sb.append(String.valueOf(s).repeat(Math.max(0, loopCount)));
            }
            System.out.println(sb);
        }
    }
}