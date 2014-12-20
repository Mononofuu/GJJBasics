import java.util.Scanner;

/**
 * Дано целое число A и натуральное число i.
 * Выведите число, которое получается из числа A инвертированием i-го бита.
 */
public class Task6_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(Integer.toBinaryString(a ^ powerOfTwo(i - 1)));
    }

    static int powerOfTwo(int number) {
        return number == 0 ? 1 : 2 << number - 1;
    }
}
