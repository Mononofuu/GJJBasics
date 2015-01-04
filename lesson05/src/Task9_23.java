public class Task9_23 {
    public static void main(String[] args) {
        Assert.assertEquals("prog", getResult("programs", 1, 4));
        Assert.assertEquals("ams", getResult("programs", 6, 8));
        Assert.assertEquals("programs", getResult("programs", 1, 8));
    }

    private static String getResult(String word, int m, int n) {
        return word.substring(m - 1, n);
    }
}
