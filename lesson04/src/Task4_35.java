import java.util.Scanner;

public class Task4_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        System.out.println(time % 5.0 > 3.0 ? "RED" : "GREEN");
    }
}
