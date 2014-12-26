import java.util.Scanner;

public class Task5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter exchange rate:");
        int rate = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d USD = %d RUB\n", i, i * rate);
        }
    }
}
