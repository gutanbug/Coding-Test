import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int[] arr = new int[3];

        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);

        while(true) {
            if (arr[2] < arr[1] + arr[0]) {
                break;
            }
            arr[2]--;
        }
        System.out.println(arr[0] + arr[1] + arr[2]);
    }
}