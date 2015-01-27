public class Task10_52 {
    public static void main(String[] args) {
        Assert.assertEquals("651", getResult(156));


    }

    static String getResult(int n) {
        if (n < 10) {
            return "" + n;
        }
        return n % 10 + "" + getResult(n / 10);
    }
}
