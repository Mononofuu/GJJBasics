import java.util.Scanner;

public class Task4_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number % 2 == 0 ? "last numeric is even" : "last numeric is odd");
    }
}
