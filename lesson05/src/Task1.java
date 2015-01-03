public class Task1 {
    public static void main(String[] args) {
        Assert.assertEquals("Привет, Иван!", getResult("Иван"));
    }

    private static String getResult(String name) {
        return ("Привет, " + name + "!");
    }
}
