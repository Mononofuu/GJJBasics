public class Task10_44 {
    public static void main(String[] args) {
        Assert.assertEquals(3, getDigitalSqrt(12));
        Assert.assertEquals(5, getDigitalSqrt(365));
        Assert.assertEquals(7, getDigitalSqrt(7));
        Assert.assertEquals(0, getDigitalSqrt(0));
    }

    static int getDigitalSqrt(int n) {
        if (n < 10) return n;
        return getDigitalSqrt(getSum(n));
    }

    static int getSum(int n) {
        if (n < 10) return n;
        return n / 10 + getSum(n % 10);
    }
}
