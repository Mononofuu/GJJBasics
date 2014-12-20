import java.util.Scanner;

/**
 * Дано число типа byte.
 * Выведите его в битовой форме: 8 бит, старшие биты слева, младшие – справа.
 */
public class Task6_I {
    public static void main(String[] args) {
        byte b = new Scanner(System.in).nextByte();
        System.out.print(Integer.toBinaryString(b));
    }
}
