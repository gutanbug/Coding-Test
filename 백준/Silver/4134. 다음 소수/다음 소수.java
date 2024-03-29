import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        for (long i = 0; i < T; i++) {
            long N = sc.nextLong();
            while(true) {
                long count = 0;
                for(long j = 2; j <= Math.sqrt(N); j++) {
                    if(N % j == 0) {
                        count++;
                        break;
                    }
                }
                if(count == 0) {
                    if(N == 0 || N == 1) {
                        N = 2;
                    }
                    sb.append(N).append("\n");
                    break;
                }
                N++;
            }
        }
        System.out.println(sb);
    }
}