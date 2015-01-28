public class Task12_23 {
    final static int SIZE = 7;

    public static void main(String[] args) {
        printArrayA();
        printArrayB();
        printArrayC();
    }

    static void printArrayA() {
        int[][] arrayA = new int[SIZE][SIZE];
        for (int i = 0; i<SIZE; i++){
            arrayA[i][i] = 1;
            arrayA[i][SIZE - 1 - i] = 1;
        }
        printArray(arrayA);
    }

    static void printArrayB() {
        int[][] arrayB = new int[7][SIZE];
        for (int i = 0; i<SIZE; i++){
            arrayB[i][i] = 1;
            arrayB[i][SIZE/2] = 1;
            arrayB[SIZE/2][i] = 1;
            arrayB[i][SIZE - 1 - i] = 1;

        }
        printArray(arrayB);
    }

    static void printArrayC() {
        int[][] arrayC = new int[SIZE][SIZE];
        for (int i = 0; i<SIZE; i++){
            arrayC[i][i] = 1;
            arrayC[i][SIZE - 1 - i] = 1;
            for (int j = i; j<SIZE-i; j++){
                arrayC[i][j]=1;
                arrayC[SIZE - 1 - i][j]=1;
            }
        }
        printArray(arrayC);
    }

    private static void printArray(int[][] mArray){
        for (int[] array : mArray) {
            for (int i : array) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
}
