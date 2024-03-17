import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[]{2, 3, 5, 7};
        int result = 0;

        int N = Integer.parseInt(br.readLine());
        String[] numList = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            List<Integer> count = new ArrayList();
            int num = Integer.parseInt(numList[i]);
            for (int j = 1; j <= num; j++){
                if(num % j == 0) {
                    count.add(j);
                }
            }
            if (count.size() == 2){
                result++;
            }
        }
        System.out.println(result);
    }
}