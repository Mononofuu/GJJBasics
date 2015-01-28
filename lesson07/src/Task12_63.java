public class Task12_63 {
    public static void main(String[] args) {
        schoolClasses();
    }

    static void schoolClasses() {
        int[][] schoolArray = new int[11][4];
        for (int i = 0; i < schoolArray.length; i++) {
            for (int j = 0; j < schoolArray[0].length; j++) {
                schoolArray[i][j] = (int) ((Math.random() + 1) * 15);
            }
        }

        for (int[] array : schoolArray) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < schoolArray.length; i++) {
            int average = 0;
            for (int j : schoolArray[i]) {
                average += j;
            }
            System.out.println(i + 1 + " parallel average learners = " + average / 4);
        }
    }
}
