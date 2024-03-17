import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;

        while(true) {
            List<Integer> list = new ArrayList<>();
            int sum = 0;

            num = Integer.parseInt(br.readLine());
            if(num == -1) {
                break;
            }
            for(int i = 1; i < num; i++){
                if(num % i == 0) {
                    list.add(i);
                }
            }
            for (int number : list) {
                sum += number;
            }
            if(sum == num) {
                System.out.print(num + " = ");
                for (int i = 0; i < list.size() - 1; i++){
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(list.size()-1));
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }
    }
}