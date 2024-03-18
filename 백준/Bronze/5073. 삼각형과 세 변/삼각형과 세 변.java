import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[3];

        while(true) {
            int max = 0;
            String[] split = br.readLine().split(" ");
            list[0] = Integer.parseInt(split[0]);
            list[1] = Integer.parseInt(split[1]);
            list[2] = Integer.parseInt(split[2]);

            Arrays.sort(list);

            if (list[0] == 0 && list[1] == 0 && list[2] == 0) {
                break;
            } else if (list[2] >= list[1] + list[0]){
                System.out.println("Invalid");
            } else if (list[0] == list[1] && list[1] == list[2]) {
                System.out.println("Equilateral");
            } else if (list[0] == list[1] || list[1] == list[2] || list[0] == list[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}