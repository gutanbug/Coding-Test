import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int num = 1;

        for(int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            if(temp >= num) {
                while(num <= temp) {
                    stack.push(num);
                    num++;
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int temp2 = stack.pop();
                if (temp2 < temp) {
                    System.out.println("NO");
                    return;
                } else {
                    sb.append("-\n");
                }
            }
        }
        System.out.println(sb);
    }
}
