import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int N = sc.nextInt();

        for(int i = 0; i <= N; i++) {
            String word = sc.nextLine();

            for (int j = 0; j < word.length(); j++) {
                if (j + 1 < word.length()) {
                    if (word.charAt(j) != word.charAt(j + 1)) {
                        for (int k = j + 1; k < word.length(); k++) {
                            if (word.charAt(j) == word.charAt(k)) {
                                set.add(word);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(N - set.size());
    }
}