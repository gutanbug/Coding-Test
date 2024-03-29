import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            String log = st.nextToken();
            if(log.equals("enter")) {
                if(!map.containsKey(person)) {
                    map.put(person, 0);
                }
                map.put(person, map.get(person) + 1);
            } else if(log.equals("leave")) {
                map.put(person, map.get(person) - 1);
            }
        }

        List<String> list = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        list.sort((e1,e2) -> {
            return e2.compareTo(e1);
        });

        for(String s : list) {
            System.out.println(s);
        }
    }
}