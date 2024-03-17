import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String[] split = sc.nextLine().split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);

            if (A == 0 && B == 0){
                break;
            } else if (A % B == 0 && A / B >= 0) {
                System.out.println("multiple");
            } else if(B % A == 0 && B / A >= 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}