import java.util.Scanner;

public class Task2_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hundreds = n/100;
        if (hundreds<1 | hundreds>9){
            System.out.println("Number is less than 100 or bigger than 1000");
            return;
        }
        int tens = n%100/10;
        int units = n%100%10;
        System.out.println("x = " + hundreds + units + tens);
    }
}
