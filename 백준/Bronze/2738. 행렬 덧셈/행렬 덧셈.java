import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] size  = sc.nextLine().split(" ");
        int N = Integer.parseInt(size[0]);
        int M = Integer.parseInt(size[1]);

        int[][] A = new int [N][M];
        int[][] B = new int [N][M];
        
        for (int i = 0; i < 2*N; i++) {
            String[] s = sc.nextLine().split(" ");
            if (i < N) {
                for(int j = 0; j < M; j++){
                    A[i][j] = Integer.parseInt(s[j]);
                }
            } else {
                for(int j = 0; j < M; j++) {
                    B[i - N][j] = Integer.parseInt(s[j]);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++){
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.println();
        }
    }
}