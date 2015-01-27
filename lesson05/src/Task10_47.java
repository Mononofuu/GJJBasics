public class Task10_47 {
    public static void main(String[] args) {
        Assert.assertEquals(2, getFibonacci(3));
        Assert.assertEquals(34, getFibonacci(9));
        Assert.assertEquals(1, getFibonacci(2));
    }

    static int getFibonacci(int k) {
        if (k == 1 || k == 2) return 1;
        return getFibonacci(k - 1) + getFibonacci(k - 2);
    }
}
