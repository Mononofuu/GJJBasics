public class Task9_42 {
    public static void main(String[] args) {
        Assert.assertEquals("elppA", getResult("Apple"));
        Assert.assertEquals("avaJ", getResult("Java"));
    }

    private static String getResult(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}
