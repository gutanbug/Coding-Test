import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[][] list = new String[5][15];

        for (int i = 0; i < 5; i++){
            String[] word = sc.nextLine().split("");
            for(int j = 0; j< word.length; j++) {
                list[i][j] = word[j];
            }
        }
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if (list[j][i] != null) {
                    sb.append(list[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}