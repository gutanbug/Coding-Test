import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int duringTime = sc.nextInt();

        int time = hour * 60 + minute;
        time += duringTime;
        
        hour = (time / 60) % 24;
        minute = time % 60;
        System.out.println(hour + " " + minute);
    }
}