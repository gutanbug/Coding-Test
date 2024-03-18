import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        int w = Integer.parseInt(split[2]);
        int h = Integer.parseInt(split[3]);

        int min = 9999;

        min = Math.min(x, min);
        min = Math.min(y, min);
        min = Math.min(w-x, min);
        min = Math.min(h-y, min);
        System.out.println(min);
    }
}