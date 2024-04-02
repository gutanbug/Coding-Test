import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }

        sb.append("<");

        while(!q.isEmpty()) {
            if(q.size() > 1) {
                for(int i = 0 ; i < K - 1; i++) {
                    Integer num = q.poll();
                    q.offer(num);
                }
                sb.append(q.poll()).append(", ");
            } else {
                sb.append(q.poll()).append(">");
            }
        }
        System.out.println(sb);
    }
}