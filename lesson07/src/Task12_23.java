public class Task12_23 {
    public static void main(String[] args) {
        printArrayA();
        printArrayB();
        printArrayC();
    }

    static void printArrayA() {
        int[][] arrayA = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arrayA[i][i] = 1;
                arrayA[i][6 - i] = 1;
            }
        }

        for (int[] array : arrayA) {
            for (int i : array) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayB() {
        int[][] arrayB = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arrayB[i][i] = 1;
                arrayB[i][6 - i] = 1;
                arrayB[i][3] = 1;
                arrayB[3][j] = 1;

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

    static void printArrayC() {
        int[][] arrayC = new int[7][7];
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 7 - i; j++) {
                arrayC[i][j] = 1;
            }
        }
        for (int i = 4; i < 7; i++) {
            for (int j = 7 - i - 1; j <= i; j++) {
                arrayC[i][j] = 1;
            }
        }

        for (int[] array : arrayC) {
            for (int i : array) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
}
