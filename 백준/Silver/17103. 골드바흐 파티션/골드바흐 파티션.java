import java.util.*;

public class Main {

    public static boolean[] prime = new boolean[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        get_prime();


        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            int temp = N;
            int count = 0;

            while(N > 1) {
                int sum = temp;
                if(!prime[N]) {
                    sum -= N;
                    if(!prime[sum]) {
                        count++;
                    }
                }
                N--;
            }
            sb.append(count / 2 + count % 2).append("\n");
        }
        System.out.println(sb);
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++) {
            for(int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}