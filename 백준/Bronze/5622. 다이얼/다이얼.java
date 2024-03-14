import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int sum = 0;


        String[] wordList = sc.next().split("");
        for(String w : wordList) {
            for(int i = 0; i < arr.length; i++) {
                if (arr[i].contains(w)){
                    sum += i + 2;
                }
            }
        }
        System.out.println(sum);
    }
}