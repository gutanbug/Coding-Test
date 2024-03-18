import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;
        boolean flag = false;

        for (int i = 1; i <= N; i++) {
            if (flag)
                break;
            int sum = 0;
            String[] split = String.valueOf(i).split("");

            for(String s : split) {
                sum += Integer.parseInt(s);
            }
            sum += i;

            if (sum == N) {
                flag = true;
                result = i;
            }
        }
        System.out.println(result);
    }
}