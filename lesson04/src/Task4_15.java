import java.util.Calendar;
import java.util.Scanner;

public class Task4_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birth date(YEAR MONTH): ");
        int birthYear = sc.nextInt();
        int birthMonth = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH);
        int age = currentMonth >= birthMonth ? currentYear - birthYear : currentYear - birthYear - 1;
        System.out.println("Your age is " + age);
    }
}
