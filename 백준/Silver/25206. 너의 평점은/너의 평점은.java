import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> grade = new HashMap<>();
        grade.put("A+", 4.5);
        grade.put("A0", 4.0);
        grade.put("B+", 3.5);
        grade.put("B0", 3.0);
        grade.put("C+", 2.5);
        grade.put("C0", 2.0);
        grade.put("D+", 1.5);
        grade.put("D0", 1.0);
        grade.put("F", 0.0);

        Scanner sc = new Scanner(System.in);
        double totalGrade = 0;
        double sum = 0;

        for (int i = 0; i < 20; i++){
            String s = sc.nextLine();
            String[] split = s.split(" ");
            if (split[2].equals("P")) {
                continue;
            }
            sum += Double.parseDouble(split[1]) * grade.get(split[2]);
            totalGrade += Double.parseDouble(split[1]);
        }
        System.out.println(sum / totalGrade);
    }
}