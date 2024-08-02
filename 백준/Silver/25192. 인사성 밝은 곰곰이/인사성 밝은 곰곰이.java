import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Set<String> set = new HashSet<>();

        int result = 0;

        for(int i = 0; i < N; i++) {
            String str = sc.next();
            if (str.equals("ENTER")) {
                result += set.size();
                set = new HashSet<>();
            } else {
                set.add(str);
            }
        }
        result += set.size();

        System.out.println(result);
    }
}
