import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> list = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "1" :
                    list.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2" :
                    list.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3" :
                    if(list.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(list.getFirst()).append("\n");
                        list.removeFirst();
                    }
                    break;
                case "4" :
                    if(list.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(list.getLast()).append("\n");
                        list.removeLast();
                    }
                    break;
                case "5" :
                    sb.append(list.size()).append("\n");
                    break;
                case "6" :
                    sb.append((list.isEmpty()) ? 1 : 0).append("\n");
                    break;
                case "7" :
                    if(list.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(list.getFirst()).append("\n");
                    }
                    break;
                case "8" :
                    if(list.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(list.getLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}