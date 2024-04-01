import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int min = 1;
        Stack<Integer> stack = new Stack<>();

        String[] arr = br.readLine().split(" ");

        //2 1 3
        for(int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if(num != min) {
                if(!stack.isEmpty() && stack.peek() == min) {
                    stack.pop();
                    i--;
                    min++;
                } else {
                    stack.push(num);
                }
            } else {
                min++;
            }
        }

        while(!stack.empty()) {
            if(stack.peek() == min) {
                stack.pop();
                min += 1;
            } else {
                sb.append("Sad");
                break;
            }
        }
        if(stack.empty()) {
            sb.append("Nice");
        }
        System.out.println(sb);
    }
}