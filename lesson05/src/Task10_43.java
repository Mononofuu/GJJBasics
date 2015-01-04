public class Task10_43 {
    public static void main(String[] args) {
        Assert.assertEquals(6, getSum(3));
        Assert.assertEquals(3, getSum(2));
        Assert.assertEquals(1, getSum(1));
        Assert.assertEquals(0, getSum(0));
        Assert.assertEquals(3, getCount(100));
        Assert.assertEquals(3, getCount(192));
        Assert.assertEquals(2, getCount(12));
        Assert.assertEquals(1, getCount(2));

    }

    static int getSum(int n) {
        if (n == 0) return 0;
        return n + getSum(n - 1);
    }

    static int getCount(int n) {
        if (n < 10) return 1;
        return 1 + getCount(n / 10);
    }
}
