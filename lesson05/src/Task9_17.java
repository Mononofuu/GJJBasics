public class Task9_17 {
    public static void main(String[] args) {
        Assert.assertEquals(true, isFisrtEqualsLast("Arizona"));
        Assert.assertEquals(false, isFisrtEqualsLast("Army"));
        Assert.assertEquals(true, isFisrtEqualsLast("bob"));
    }

    private static Boolean isFisrtEqualsLast(String word) {
        return word.toLowerCase().charAt(0) == word.charAt(word.length() - 1);
    }
}
