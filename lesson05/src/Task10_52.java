public class Task10_52 {
    public static void main(String[] args) {
        getResult(156);

    }

    static void getResult(int n) {
        if (n >= 1) {
            System.out.print(n % 10);
            getResult(n / 10);
        }
    }

}
