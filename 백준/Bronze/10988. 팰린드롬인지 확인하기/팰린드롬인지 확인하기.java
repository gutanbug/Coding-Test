import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] word = sc.nextLine().split("");
        int left = 0, right = word.length-1;
        boolean flag = false;

        for (int i = 0; i < word.length; i++) {
            while(left < right) {
                if(!word[left++].equals(word[right--])){
                    flag = true;
                    break;
                }
            }
        }
        System.out.println((!flag) ? 1 : 0);
    }
}