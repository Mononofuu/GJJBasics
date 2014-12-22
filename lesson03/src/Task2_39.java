import java.util.Scanner;

public class Task2_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        int secondsInDay = 12 * 60 * 60;

        int currentTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        int angle = (currentTimeInSeconds * 360) / secondsInDay;
        if (angle > 360) angle %= 360;
        System.out.println("Угол между стрелками = " + angle + " градусов");
    }
}
