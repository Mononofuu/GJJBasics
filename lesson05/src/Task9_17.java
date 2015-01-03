public class Task9_17 {
    public static void main(String[] args) {
        Assert.assertEquals(true, getResult("Arizona"));
        Assert.assertEquals(false, getResult("Army"));
        Assert.assertEquals(true, getResult("bob"));
    }

    private static Boolean getResult(String word) {
        return word.toLowerCase().charAt(0) == word.charAt(word.length() - 1);
    }
}
