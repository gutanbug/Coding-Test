import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String word = sc.next();
            String start = word.substring(0, 1);
            String end = word.substring(word.length()-1);
            System.out.println(start+end);
        }
    }
}