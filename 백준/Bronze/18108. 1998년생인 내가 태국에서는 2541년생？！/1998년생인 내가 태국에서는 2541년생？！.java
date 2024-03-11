import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int between = 2562-2019;
        int date = sc.nextInt();

        System.out.println(date - between);
    }
}