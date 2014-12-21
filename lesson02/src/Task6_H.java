import java.util.Scanner;

/**
 * Дано целое число A и натуральное число i.
 * Выведите значение i-го бита числа A, то есть 0 или 1.
 */
public class Task6_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(Integer.toBinaryString(a)); //Binary form of given number
        System.out.println((a << (32 - i)) >>> (31)); // option 1: with left and unsigned right shifts
        System.out.println((a & powerOfTwo(i - 1)) >> (i - 1)); // option 2: using AND with mask

    }

    static int powerOfTwo(int number) {
        return number == 0 ? 1 : 2 << number - 1;
    }
}
