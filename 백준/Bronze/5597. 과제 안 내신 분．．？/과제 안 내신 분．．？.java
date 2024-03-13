import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        int[] arr = new int [30];

        for(int i : arr) {
            i = 0;
        }

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            arr[num-1] = 1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                if (a == 0) {
                    a = i + 1;
                } else {
                    b = i + 1;
                }
            }
        }

        if (a > b) {
            System.out.println(b);
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
        }
    }
}