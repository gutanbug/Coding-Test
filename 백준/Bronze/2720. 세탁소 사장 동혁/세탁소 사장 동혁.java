import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int quarter = 0, dime = 0, nickel = 0, penny = 0;
            int money = Integer.parseInt(br.readLine());
            while(money >= 25) {
                quarter++;
                money -= 25;
            }
            while(money >= 10) {
                dime++;
                money -= 10;
            }
            while(money >= 5) {
                nickel++;
                money -= 5;
            }
            while(money > 0) {
                penny++;
                money -= 1;
            }
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
        br.close();
    }
}