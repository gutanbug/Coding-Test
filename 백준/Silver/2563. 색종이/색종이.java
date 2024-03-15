import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        boolean[][] flag = new boolean[100][100];
        for (boolean[] b : flag) {
            for (boolean b0 : b) {
                b0 = false;
            }
        }

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String[] split = sc.nextLine().split(" ");
            int X = Integer.parseInt(split[0]);
            int Y = Integer.parseInt(split[1]);

            for(int j = X; j < X+10; j++) {
                for(int k = Y; k < Y+10; k++) {
                    flag[j][k] = true;
                }
            }
        }
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(flag[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
