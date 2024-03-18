import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        int minX = 10001, maxX = -10001, minY = 10001, maxY = -10001;

        for (int i = 0; i < N; i++){
            String[] split = br.readLine().split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            xSet.add(x);
            ySet.add(y);
        }

        for(int i : xSet) {
            maxX = Math.max(maxX, i);
            minX = Math.min(minX, i);
        }
        for(int i : ySet) {
            maxY = Math.max(maxY, i);
            minY = Math.min(minY, i);
        }
        System.out.println((maxX-minX) * (maxY-minY));
    }
}