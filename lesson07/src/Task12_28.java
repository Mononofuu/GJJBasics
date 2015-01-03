public class Task12_28 {
    public static void main(String[] args) {
        printArray();
    }

    static void printArray() {
        int[][] arrayA = new int[5][5];
        int count = 1;
        for (int spiral = 5; spiral >= 0; spiral--) {
            for (int j = 5 - spiral; j < spiral; j++) {
                arrayA[5 - spiral][j] = count++;
            }
            for (int i = 5 - spiral + 1; i < spiral; i++) {
                arrayA[i][spiral - 1] = count++;
            }
            for (int j = spiral - 2; j >= 5 - spiral; j--) {
                arrayA[spiral - 1][j] = count++;
            }
            for (int i = spiral - 2; i >= 5 - spiral + 1; i--) {
                arrayA[i][5 - spiral] = count++;
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
}
