public class Task9_22 {
    public static void main(String[] args) {
        Assert.assertEquals("prog", getResult("programs"));
        Assert.assertEquals("ro", getResult("roll"));
        Assert.assertEquals("Ba", getResult("Ball"));
    }

    private static String getResult(String word) {
        return word.substring(0, word.length() / 2);
    }
}
