import java.util.*;

public class Main {

    public static boolean[] prime = new boolean[123456 * 2 + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = 0;

        while ((n = sc.nextInt()) != 0) {
            get_prime(prime);
            int count = 0;
            if(n == 1) {
                sb.append(1).append("\n");
            } else {
                for(int i = n + 1; i <= 2 * n; i++) {
                    if(!prime[i]) {
                        count++;
                    }
                }
                sb.append(count).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void get_prime(boolean[] prime) {
        prime[0] = prime[1] = true;
        for(int i = 0; i < Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}