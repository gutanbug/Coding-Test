import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int num = 1;

        while(N > num){
            num += 6 * count;
            count++;
        }
        System.out.println(count);
    }
}