import java.util.Scanner;

/**
 * поменять значения двух переменных, не используя промежуточной переменной, 2мя способами
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        method 1:
        a += b;
        b = a - b;
        a -= b;
        System.out.printf("a=%d, b=%d", a, b);

//        method 2:
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.printf("\na=%d, b=%d", a, b);
    }
}
