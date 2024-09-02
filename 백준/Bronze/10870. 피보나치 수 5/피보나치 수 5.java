import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(fibo(num));
    }
    public static int fibo(int a) {
        if(a == 0) {
            return 0;
        } else if(a == 1) {
            return 1;
        } else {
            return fibo(a-1) + fibo(a-2);
        }
    }
}
