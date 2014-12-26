import java.util.Scanner;

public class Task5_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.printf("Please enter district %d population and density:\n", i);
            area += sc.nextInt() / sc.nextInt();
        }
        System.out.println("Full area is " + area);
    }
}
