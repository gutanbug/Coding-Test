import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        boolean[][] arr = new boolean[N][M];

        int count = 100;

        for(int i = 0; i < N; i++){
            String[] split1 = sc.nextLine().split("");
            for(int j = 0; j < split1.length; j++) {
                arr[i][j] = split1[j].equals("B");
            }
        }

        for(int i = 0; i <= N-8; i++) {
            for(int j = 0; j <= M-8; j++) {
                int temp = 0;
                boolean start = arr[i][j];

                for(int a = i; a <= i+7; a++) {
                    for(int b = j; b <= j+7; b++) {
                        if (start != arr[a][b]){
                            temp++;
                        }
                        start = !start;
                    }
                    start = !start;
                }
                temp = Math.min(temp, 64-temp);
                count = Math.min(temp,count);
            }
        }
        System.out.println(count);
    }
}
