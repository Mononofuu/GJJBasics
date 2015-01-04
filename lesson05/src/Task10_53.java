public class Task10_53 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArrayRevert(array, array.length - 1);
    }

    static void printArrayRevert(int[] array, int i) {
        if (i >= 0) {
            System.out.print(array[i]);
            printArrayRevert(array, i - 1);
        }
    }
}
