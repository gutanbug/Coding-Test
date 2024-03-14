import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] black = {1,1,2,2,2,8};
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        for (int num : black) {
            int white = Integer.parseInt(st.nextToken());
            sb.append((num - white)).append(" ");
        }
        System.out.println(sb);
    }
}