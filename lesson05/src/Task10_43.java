public class Task10_43 {
    public static void main(String[] args) {
        Assert.assertEquals(3, getSum(3));
        Assert.assertEquals(4, getSum(22));
        Assert.assertEquals(7, getSum(133));
        Assert.assertEquals(3, getCount(100));
        Assert.assertEquals(3, getCount(192));
        Assert.assertEquals(2, getCount(12));
        Assert.assertEquals(1, getCount(2));

    }

    static int getSum(int n) {
        if (n < 10) return n;
        return n % 10 + getSum(n / 10);
    }

    static int getCount(int n) {
        if (n < 10) return 1;
        return 1 + getCount(n / 10);
    }
}
