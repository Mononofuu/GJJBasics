public class Task10_50 {
    public static void main(String[] args) {
        Assert.assertEquals(5, getAkkerman(1, 3));
        Assert.assertEquals(12, getAkkerman(1, 10));
        Assert.assertEquals(23, getAkkerman(2, 10));
        Assert.assertEquals(13, getAkkerman(4, 0));
    }

    static int getAkkerman(int n, int m) {
        if (n == 0) return m + 1;
        if (n != 0 & m == 0) return getAkkerman(n - 1, 1);
        return getAkkerman(n - 1, getAkkerman(n, m - 1));
    }
}