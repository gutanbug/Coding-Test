import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        String target = br.readLine();
        int count = 0;

        for(String s : numbers) {
            if (s.equals(target)){
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}