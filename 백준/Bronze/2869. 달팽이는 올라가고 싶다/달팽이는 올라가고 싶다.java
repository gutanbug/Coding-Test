import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");

        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int V = Integer.parseInt(split[2]);

        int divide = 0 ;

        if((V - A) % (A - B) != 0){
            divide = (V - A) / (A - B) + 1;
        } else{
            divide = (V - A) / (A - B);
        }
        System.out.println(divide+1);
    }
}