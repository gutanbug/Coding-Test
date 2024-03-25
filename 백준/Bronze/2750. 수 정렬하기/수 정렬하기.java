import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        list.sort(null);

        for(int i : list) {
            System.out.println(i);
        }
    }
}