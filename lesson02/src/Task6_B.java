import java.util.Scanner;

/**
 * Даны два неравных числа: n и m, не превосходящие 31. Вычислите 2^n+2^m.
 */
public class Task6_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = powerOfTwo(n) | powerOfTwo(m);
        System.out.println(String.format("2^%d+2^%d=%s", n, m, Integer.toBinaryString(result)));
    }

    static int powerOfTwo(int number) {
        return number == 0 ? 1 : 2 << number - 1;
    }
}
