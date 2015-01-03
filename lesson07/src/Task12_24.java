public class Task12_24 {
    public static void main(String[] args) {
        printArrayA();
        printArrayB();
    }

    static void printArrayA() {
        int[][] arrayA = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arrayA[i][j] = 1;
                if (i > 0 & j > 0) {
                    arrayA[i][j] = arrayA[i - 1][j] + arrayA[i][j - 1];

                }

            }
        }

        for (int[] array : arrayA) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayB() {
        int[][] arrayB = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arrayB[i][j] = (j + i) % 6 + 1;
            }
        }

        for (int[] array : arrayB) {
            for (int i : array) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
}
