import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i : arr) {
            sum += i;
        }
        Arrays.sort(arr);

        System.out.println(sum / arr.length);
        System.out.println(arr[2]);
    }
}