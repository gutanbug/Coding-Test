import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), "");
        String[] split = st.nextToken().split("");
        char[] arr = new char[S];

        st = new StringTokenizer(br.readLine(), " ");
        int[] checkNum = new int[4];
        for(int i = 0; i < checkNum.length; i++) {
            checkNum[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < S; i++) {
            arr[i] = split[i].charAt(0);
        }

        int start_idx = 0;
        int end_idx = P-1;
        int cnt = 0;
        int[] num = new int[4];

        while(end_idx <= S - 1) {
            if (start_idx == 0) {
                for(int i = 0; i <= end_idx; i++) {
                    calculate(arr[i], num);
                }
            } else {
                char prev = arr[start_idx - 1];
                char next = arr[end_idx];
                calculate(next, num);
                if (prev == 'A') {
                    num[0]--;
                } else if (prev == 'C') {
                    num[1]--;
                } else if (prev == 'G') {
                    num[2]--;
                } else {
                    num[3]--;
                }
            }
            if(checkNum[0] <= num[0] && checkNum[1] <= num[1] && checkNum[2] <= num[2] && checkNum[3] <= num[3]) {
                cnt++;
            }
            start_idx++;
            end_idx++;
        }
        System.out.println(cnt);
    }

    private static void calculate(char c, int[] num) {
        if (c == 'A') {
            num[0]++;
        } else if (c == 'C') {
            num[1]++;
        } else if (c == 'G') {
            num[2]++;
        } else {
            num[3]++;
        }
    }
}
