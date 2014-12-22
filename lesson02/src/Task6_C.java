import java.util.Scanner;

/**
 * Дано целое число A и натуральное число i.
 * Обнулите у числа A его последние i бит и выведите результат.
 */
public class Task6_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(Integer.toBinaryString((a >>> i) << i));
    }
}
