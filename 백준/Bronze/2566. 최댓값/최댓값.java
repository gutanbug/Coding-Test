import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 9, max = 0;
        int X = 0, Y = 0;


        for(int i = 0; i < N; i++) {
            String[] split = sc.nextLine().split(" ");
            for(int j = 0; j < split.length; j++) {
                if(max <= Integer.parseInt(split[j])) {
                    max = Integer.parseInt(split[j]);
                    X = i + 1;
                    Y = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(X + " " + Y);
    }
}