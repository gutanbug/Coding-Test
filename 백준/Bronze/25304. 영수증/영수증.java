import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long total = sc.nextInt();
        int num = sc.nextInt();
        long sum = 0;

        for (int i=0; i<num; i++) {
            long price = sc.nextLong();
            long count = sc.nextLong();

            sum += price * count;
        }
        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}