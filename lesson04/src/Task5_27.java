import java.util.Scanner;

public class Task5_27 {
    public static void main(String[] args) {
        // a)
        sum(100, 500);
        // b)
        Scanner sc = new Scanner(System.in);
        sum(sc.nextInt(), 500);
        // c)
        sum(-10, sc.nextInt());
        // d)
        sum(sc.nextInt(), sc.nextInt());

    }

    static void sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
