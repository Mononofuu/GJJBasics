import java.util.Scanner;

/**
 * Дано целое число A и натуральное число n.
 * Выведите число, которое состоит только из n последних бит числа A
 * (то есть обнулите все биты числа A, кроме последних n).
 */
public class Task6_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(Integer.toBinaryString((a << i) >>> i));
    }
}
