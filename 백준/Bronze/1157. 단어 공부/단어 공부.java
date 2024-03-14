import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String result = "";
        int count = 0;

        Map<String, Integer> map = new HashMap<>();

        String[] word = sc.nextLine().toUpperCase().split("");

        for (String s : word) {
            map.merge(s, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            max = Math.max(entry.getValue(),max);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                count++;
                result = entry.getKey();
            }
        }
        System.out.println((count != 1) ? "?" : result);
    }
}