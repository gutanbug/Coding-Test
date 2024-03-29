import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10];

        String[] num = sc.next().split("");

        for(int i = 0; i < num.length; i++) {
            arr[Integer.parseInt(num[i])]++;
        }

        for(int i = 9; i >= 0; i--) {
            while(arr[i]-- > 0) {
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}