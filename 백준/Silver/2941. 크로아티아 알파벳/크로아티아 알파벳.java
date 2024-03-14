import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int length = word.length();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'c') {
                if(i < length - 1)
                    if (word.charAt(i + 1) == '=') {
                        i++;
                    } else if(word.charAt(i + 1) == '-') {
                        i++;
                    }
            } else if(word.charAt(i) == 'd' && i < length - 1) {
                if (word.charAt(i + 1) == '-') {
                    i++;
                } else if (word.charAt(i + 1) == 'z' && i < length - 2) {
                    if (word.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            } else if (word.charAt(i) == 'l' && i < length - 1) {
                if (word.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (word.charAt(i) == 'n' && i < length - 1) {
                if (word.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (word.charAt(i) == 's' && i < length - 1) {
                if (word.charAt(i + 1) == '=') {
                    i++;
                }
            } else if (word.charAt(i) == 'z' && i < length - 1) {
                if (word.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}