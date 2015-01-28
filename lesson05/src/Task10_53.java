public class Task10_53 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals("987654321",printArrayRevert(array, array.length - 1));
    }

    static String printArrayRevert(int[] array, int i) {
        if (i == 0) {
            return "" + array[0];
        }
        return array[i] + printArrayRevert(array, i - 1);
    }
}
