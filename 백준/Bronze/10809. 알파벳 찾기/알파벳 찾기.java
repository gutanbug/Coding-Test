import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] chList = new int[26];

        Arrays.fill(chList, -1);

        String word = sc.next();
        String[] wordList = word.split("");

        for (String s : wordList) {
            int index = s.charAt(0) - 97;
            chList[index] = word.indexOf(s);
        }

        for (int j : chList) {
            sb.append(j).append(" ");
        }
        System.out.println(sb);
    }
}