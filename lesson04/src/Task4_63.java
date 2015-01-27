import java.util.Scanner;

public class Task4_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.println(day % 7 == 6 || day % 7 == 0 ? "Weekend" : "Workday");
    }
}
