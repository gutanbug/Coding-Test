import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        String[] arr = b.split("");

        for (int i = 2; i >= 0 ; i--) {
            System.out.println(Integer.parseInt(arr[i]) * a);
        }
        System.out.println(Integer.parseInt(b) * a);
    }
}