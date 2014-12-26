import java.util.Scanner;

public class Task6_87 {
    public static void main(String[] args) {
        int aScore = 0;
        int bScore = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter score[1 or 2 or 3]");
            int score = sc.nextInt();
            if (score == 0) break;
            System.out.println("Enter who score[1 or 2]");
            if (sc.nextInt() == 1) aScore += score;
            else bScore += score;
            System.out.printf("Team 1 %d:%d Team 2\n", aScore, bScore);
        }
        if (aScore > bScore) {
            System.out.printf("Team 1 wins with %d score", aScore);
        } else if (aScore < bScore) {
            System.out.printf("Team 2 wins with %d score", bScore);
        } else System.out.println("Draw");
    }
}
