public class Task9_42 {
    public static void main(String[] args) {
        Assert.assertEquals("elppA", getResult("Apple"));
        Assert.assertEquals("avaJ", getResult("Java"));
    }

    private static String getResult(String word) {
        StringBuilder string = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            string.append(word.charAt(i));
        }
        return string.toString();
    }
}
