import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> stringMap = new HashMap<>();
        Map<String, String> idxMap = new HashMap<>();

        int idx = 1;
        for(int i = 0; i < N; i++) {
            String name = br.readLine();
            stringMap.put(String.valueOf(idx), name);
            idxMap.put(name, String.valueOf(idx++));
        }

        for(int i = 0; i < M; i++) {
            String s = br.readLine();
            if(stringMap.containsKey(s)) {
                sb.append(stringMap.get(s)).append("\n");
            } else {
                sb.append(idxMap.get(s)).append("\n");
            }
        }
        System.out.println(sb);
    }
}