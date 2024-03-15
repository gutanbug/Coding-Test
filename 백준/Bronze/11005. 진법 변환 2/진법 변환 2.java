import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> list = new ArrayList<>();

        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);

        while(N > 0) {
            if((N % B) < 10) {
                list.add((char) (N % B + '0'));
            } else {
                list.add((char) ('A' - 10 + (N % B)));
            }
            N /= B;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}