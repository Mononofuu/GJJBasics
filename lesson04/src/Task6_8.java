import java.util.Scanner;

public class Task6_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 1;
        for (int i = 1; power <= n; ) {
            System.out.print(power + " ");
            i++;
            power = (int) Math.pow(i, 2);
        }
    }
}
