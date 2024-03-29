import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            if(!map.containsKey(number)) {
                map.put(number, 0);
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] num = new int[M];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int j : num) {
            if (map.containsKey(j)) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}