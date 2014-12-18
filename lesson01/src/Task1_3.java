import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        try {
            number = sc.nextInt();
            System.out.println("Вы ввели число " + number);
        }catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
    }
}
