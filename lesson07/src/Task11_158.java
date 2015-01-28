public class Task11_158 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 1, 5, 2, 4, 7};
        int[] array2 = {3, 4, 3, 5, 3, 4, 1};
        int[] array3 = {3, 4, 3, 5, 3, 4, 3};
        Assert.assertEquals("2415700", removeArrayDuplicates(array1));
        Assert.assertEquals("3451000", removeArrayDuplicates(array2));
        Assert.assertEquals("3450000", removeArrayDuplicates(array3));
    }

    static int[] removeArrayDuplicates(int[] array) {
        int left = array.length - 1;
        for (int i = 0; i <= left; i++) {
            for (int j = i + 1; j <= left; j++) {
                if (array[i] == array[j]) {
                    System.arraycopy(array, j + 1, array, j, left - j);
                    array[left] = 0;
                    left--;
                }
            }
        }
        return array;
    }
}