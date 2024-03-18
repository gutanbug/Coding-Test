import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        String[] numList = sc.nextLine().split(" ");

        int[] arr = new int [N];
        Set<Integer> result = new HashSet<>();
        int min = 100001;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(numList[i]);
        }
        Arrays.sort(arr);

        for(int i = 0; i < arr.length-2; i++) {
            for(int j = i + 1; j < arr.length-1; j++) {
                for(int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] <= M) {
                        result.add(arr[i]+arr[j]+arr[k]);
                    }
                }
            }
        }
        for(int i : result) {
            int abs = Math.abs(M - i);
            min = Math.min(min, abs);
        }
        System.out.println(M-min);
    }
}