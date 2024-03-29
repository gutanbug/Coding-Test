import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N + M; i++) {
            String name = br.readLine();
            if(!map.containsKey(name)) {
                map.put(name, 0);
            }
            map.put(name, map.get(name) + 1);
        }

        int count = 0;
        List<String> list = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 2) {
                count++;
                list.add(entry.getKey());
            }
        }

        list.sort(String::compareTo);

        System.out.println(count);
        for(String s : list) {
            System.out.println(s);
        }
    }
}