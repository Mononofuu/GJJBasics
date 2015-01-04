public class Task9_102 {
    public static void main(String[] args) {
        Assert.assertEquals("groprams", getResult("programs", 1, 4));
        Assert.assertEquals("progrsma", getResult("programs", 6, 8));
        Assert.assertEquals("srogramp", getResult("programs", 1, 8));
    }

    private static String getResult(String word, int m, int n) {
        char tempChar = word.charAt(m - 1);
        char[] wordCharArray = word.toCharArray();
        wordCharArray[m - 1] = wordCharArray[n - 1];
        wordCharArray[n - 1] = tempChar;
        return new String(wordCharArray);
    }
}
