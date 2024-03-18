import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();

        int resultX = 0, resultY = 0;

        for (int i = 0; i < 3; i++) {
            String[] split = br.readLine().split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);

            xMap.putIfAbsent(x, 0);
            yMap.putIfAbsent(y, 0);
            if (!xMap.isEmpty()) {
                xMap.put(x, xMap.get(x) + 1);
            }
            if (!yMap.isEmpty()) {
                yMap.put(y, yMap.get(y) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : xMap.entrySet()) {
            if (entry.getValue() == 1) {
                resultX = entry.getKey();
            }
        }
        for (Map.Entry<Integer, Integer> entry : yMap.entrySet()) {
            if (entry.getValue() == 1) {
                resultY = entry.getKey();
            }
        }
        System.out.println(resultX + " " + resultY);
    }
}