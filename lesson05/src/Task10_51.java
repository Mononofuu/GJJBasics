public class Task10_51 {
    public static void main(String[] args) {
        proc1(5);
        System.out.println();
        proc2(5);
        System.out.println();
        proc3(5);
    }

    static void proc1(int n) {
        if (n > 0) {
            System.out.println(n); //n is printed on every step before next recursion call
            proc1(n - 1);
        }
    }

    static void proc2(int n) {
        if (n > 0) {
            proc2(n - 1);
            System.out.println(n);//n is printed on every step after last recursion call (when we reach the bottom)
        }
    }

    static void proc3(int n) {
        if (n > 0) {
            System.out.println(n);//n is printed on every step before next recursion call
            proc3(n - 1);
        }
        System.out.println(n);//and when we get out from the bottom of recursion n is printed again. Starts from 0
    }

}
