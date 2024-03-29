import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        for(int i = 0; i < list.size() - 1; i++) {
            set.add(list.get(i+1) - list.get(i));
        }

        int gcd = 0;
        for(int i : set) {
            gcd = gcd(gcd, i);
        }

        int result = 0;

        for(int i = 0; i < list.size() - 1; i++) {
            result += (list.get(i + 1) - list.get(i)) / gcd - 1;
        }

        System.out.println(result);
    }

    private static int gcd(int gcd, int i) {
        if(i == 0) {
            return gcd;
        }
        return gcd(i, gcd % i);
    }
}