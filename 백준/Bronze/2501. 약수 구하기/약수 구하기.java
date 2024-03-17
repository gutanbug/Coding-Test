import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        for(int i = 1; i <= N; i++) {
            if(N % i == 0){
                list.add(i);
            }
        }
        if(list.size() < K){
            System.out.println(0);
        } else {
            System.out.println(list.get(K-1));
        }
    }
}