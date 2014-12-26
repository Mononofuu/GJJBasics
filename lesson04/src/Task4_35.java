import java.util.Scanner;

public class Task4_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        System.out.println(time % 5 > 3 ? "RED" : "GREEN");
    }
}
