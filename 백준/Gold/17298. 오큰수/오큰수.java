import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] ans = new int[N];

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for(int i = 1; i < N; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
