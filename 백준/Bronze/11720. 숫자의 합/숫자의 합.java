import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        String num = br.readLine();
        String[] numList = num.split("");
        for (String number : numList) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}