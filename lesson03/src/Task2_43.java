import java.util.Scanner;

public class Task2_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 1 + (a%b) * (b%a);
        System.out.println(c);
    }
}
