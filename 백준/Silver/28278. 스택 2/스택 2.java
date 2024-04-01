import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            if(arr[0].equals("1")) {
                stack.push(Integer.parseInt(arr[1]));
            } else if(arr[0].equals("2")) {
                if(!stack.empty()) {
                    sb.append(stack.pop()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            } else if (arr[0].equals("3")) {
                sb.append(stack.size()).append("\n");
            } else if (arr[0].equals("4")) {
                if(stack.empty()){
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (arr[0].equals("5")) {
                if(!stack.empty()) {
                    sb.append(stack.peek()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}