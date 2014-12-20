import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        try {
            System.out.println("Вы ввели число " + new Scanner(System.in).nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
    }
}
