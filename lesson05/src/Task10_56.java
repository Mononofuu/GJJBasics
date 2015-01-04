public class Task10_56 {
    public static void main(String[] args) {
        Assert.assertEquals(true, simpleNumberCheck(7, 2));
        Assert.assertEquals(true, simpleNumberCheck(11, 2));
        Assert.assertEquals(true, simpleNumberCheck(13, 2));
        Assert.assertEquals(false, simpleNumberCheck(14, 2));
    }

    static Boolean simpleNumberCheck(int n, int div) {
        if (div * div <= n) {
            return n % div == 0 & simpleNumberCheck(n, div + 1);
        } else {
            return true;
        }
    }
}
