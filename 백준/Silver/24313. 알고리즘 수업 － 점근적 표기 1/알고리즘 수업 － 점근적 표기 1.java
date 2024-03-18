import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int a1 = Integer.parseInt(split[0]);
        int a0 = Integer.parseInt(split[1]);

        int c = sc.nextInt();
        int n0 = sc.nextInt();

        boolean flag = false;

        for (int i = n0; i < n0 + 20; i++) {
            if ((a1 * i + a0) > i * c) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
