public class Task10_47 {
    public static void main(String[] args) {
        Assert.assertEquals(2, getFibonacchi(3));
        Assert.assertEquals(34, getFibonacchi(9));
        Assert.assertEquals(1, getFibonacchi(2));
    }

    static int getFibonacchi(int k) {
        if (k == 1 || k == 2) return 1;
        return getFibonacchi(k - 1) + getFibonacchi(k - 2);
    }
}
