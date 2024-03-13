import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String num1 = st.nextToken();
        num1 = num1.substring(num1.length() - 1)
                + num1.charAt(num1.length()-2)
                + num1.charAt(0);
        String num2 = st.nextToken();
        num2 = num2.substring(num2.length()-1)
                + num2.charAt(num2.length()-2)
                + num2.charAt(0);
        System.out.println(Math.max(Integer.parseInt(num1), Integer.parseInt(num2)));
    }
}