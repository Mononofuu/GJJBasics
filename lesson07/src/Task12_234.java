public class Task12_234 {
    public static void main(String[] args) {
        remLine(getArray(), 2);
        remColumn(getArray(), 2);

    }

    static int[][] getArray() {
        int[][] simpleArray = new int[5][5];
        int count = 0;
        for (int i = 0; i < simpleArray.length; i++) {
            for (int j = 0; j < simpleArray[0].length; j++) {
                simpleArray[i][j] = count;
                count++;
            }
        }

        for (int[] array : simpleArray) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();

        return simpleArray;
    }

    static void remLine(int[][] array, int k) {
        int[][] newArray = new int[array.length - 1][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == k) ;
                else if (i > k) newArray[i - 1][j] = array[i][j];
                else {
                    newArray[i][j] = array[i][j];
                }
            }
        }

        for (int[] arr : newArray) {
            for (int i : arr) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void remColumn(int[][] array, int s) {
        int[][] newArray = new int[array.length][array[0].length - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == s) ;
                else if (j > s) newArray[i][j - 1] = array[i][j];
                else {
                    newArray[i][j] = array[i][j];
                }
            }
        }

        for (int[] arr : newArray) {
            for (int i : arr) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
