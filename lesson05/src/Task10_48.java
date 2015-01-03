public class Task10_48 {
    public static void main(String[] args) {
        int[] array = {2, 1, 6, 3, 45, 2, 4, 89, 5, 34, 5};
        Assert.assertEquals(89, max(array, array.length - 1));
    }

    public static int max(int[] array, int n) {
        if (n == 0) {
            return array[0];
        }
        return Math.max(max(array, n - 1), array[n]);
    }

}
