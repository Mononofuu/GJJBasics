public class Task9_15 {
    public static void main(String[] args) {
        Assert.assertEquals("p", getResult("Apple", 1));
        Assert.assertEquals(" ", getResult("Apple Pie", 5));
        Assert.assertEquals("e", getResult("Apple", 4));
    }

    private static String getResult(String word, int i) {
        return word.charAt(i) + "";
    }


}
