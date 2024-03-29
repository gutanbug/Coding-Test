import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        if (A == 60 && A == B && B == C) {
            System.out.println("Equilateral");
        } else if((A + B + C) == 180 && (A == B || B == C || A == C)) {
            System.out.println("Isosceles");
        } else if((A + B + C) == 180 && (A != B && B != C && A != C)) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}