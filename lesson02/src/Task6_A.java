import java.util.Scanner;

/**
 * Дано число n<32. Запишите число 2^n, то есть число, у которого n-й бит равен 1, а остальные – нули.
 */
public class Task6_A {
    public static void main(String[] args) {
        System.out.println("Введите n");
        int n = new Scanner(System.in).nextInt();
        int result = n == 0 ? 1 : 2 << n - 1;
        System.out.printf("2^%d=%s", n, Integer.toBinaryString(result));
    }
}
