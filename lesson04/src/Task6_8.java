import java.util.Scanner;

public class Task6_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while ((int) Math.pow(i, 2) <= n) {
            System.out.print((int) Math.pow(i, 2) + " ");
            i++;
        }
    }
}
