public class Task10_42 {
    public static void main(String[] args) {
        Assert.assertEquals(4, getPow(2, 2));
        Assert.assertEquals(8, getPow(2, 3));
        Assert.assertEquals(1, getPow(2, 0));
    }

    static int getPow(int a, int n) {
        if (n == 0) return 1;
        return a * getPow(a, n - 1);
    }
}
