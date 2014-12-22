import java.util.Scanner;

/**
 * Дано число типа byte.
 * Выведите его в битовой форме: 8 бит, старшие биты слева, младшие – справа.
 */
public class Task6_I {
    public static void main(String[] args) {
        byte number = new Scanner(System.in).nextByte();
        StringBuffer str = new StringBuffer();
        do {
            str.append(number%2);
        }while ((number/=2)>=1);
        System.out.println(str.reverse());
    }
}
