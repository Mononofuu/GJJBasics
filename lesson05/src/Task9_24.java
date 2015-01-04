public class Task9_24 {
    public static void main(String[] args) {
        Assert.assertEquals("блок око", getResult("яблоко"));
    }

    private static String getResult(String word) {
        return word.substring(1, 5) + " " + word.substring(3);
    }
}
