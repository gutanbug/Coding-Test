import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[] count = new int[1001];

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            char[] arr = br.readLine().toCharArray();

            int result = isPalindrome(i, arr, 0, arr.length-1);
            sb.append(result).append(" ").append(count[i]).append("\n");
        }

        System.out.println(sb);
    }
    public static int isPalindrome(int i ,char[] arr, int start, int end) {
        return recursion(i, arr, start, end);
    }
    public static int recursion(int i, char[] arr, int start, int end) {
        count[i]++;
        if(start >= end) {
            return 1;
        } else if(arr[start] != arr[end]) {
            return 0;
        } else {
            return recursion(i, arr, start+1, end-1);
        }
    }
}
