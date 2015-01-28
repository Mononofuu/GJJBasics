public class Task10_56 {
    public static void main(String[] args) {
        Assert.assertEquals(true, isPrime(7));
        Assert.assertEquals(true, isPrime(11));
        Assert.assertEquals(true, isPrime(13));
        Assert.assertEquals(false, isPrime(14));
    }

    static boolean isPrime(int n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
