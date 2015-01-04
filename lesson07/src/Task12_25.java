public class Task12_25 {
    public static void main(String[] args) {
        printArrayA();
        printArrayB();
        printArrayC();
        printArrayD();
        printArrayE();
        printArrayF();
        printArrayG();
        printArrayH();
        printArrayI();
        printArrayK();
        printArrayL();
        printArrayM();
        printArrayN();
        printArrayO();
        printArrayP();
        printArrayR();

    }

    static void printArrayA() {
        int[][] arrayA = new int[12][10];
        int count = 1;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                arrayA[i][j] = count++;
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
        int[][] arrayB = new int[12][10];
        int count = 1;
        for (int j = 0; j < arrayB[0].length; j++) {
            for (int i = 0; i < arrayB.length; i++) {
                arrayB[i][j] = count++;
            }
        }

        for (int[] array : arrayB) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayC() {
        int[][] arrayC = new int[12][10];
        int count = 1;
        for (int i = 0; i < arrayC.length; i++) {
            for (int j = arrayC[i].length - 1; j >= 0; j--) {
                arrayC[i][j] = count++;
            }
        }

        for (int[] array : arrayC) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayD() {
        int[][] arrayD = new int[12][10];
        int count = 1;
        for (int j = 0; j < arrayD[0].length; j++) {
            for (int i = arrayD.length - 1; i >= 0; i--) {
                arrayD[i][j] = count++;
            }
        }

        for (int[] array : arrayD) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayE() {
        int[][] arrayE = new int[10][12];
        int count = 1;
        for (int i = 0; i < arrayE.length; i++) {
            if (!(i % 2 == 0)) {
                for (int j = arrayE[i].length - 1; j >= 0; j--) {
                    arrayE[i][j] = count++;
                }
            } else {
                for (int j = 0; j < arrayE[i].length; j++) {
                    arrayE[i][j] = count++;
                }
            }
        }

        for (int[] array : arrayE) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayF() {
        int[][] arrayF = new int[12][10];
        int count = 1;
        for (int j = 0; j < arrayF[0].length; j++) {
            if (!(j % 2 == 0)) {
                for (int i = arrayF.length - 1; i >= 0; i--) {
                    arrayF[i][j] = count++;
                }
            } else {
                for (int i = 0; i < arrayF.length; i++) {
                    arrayF[i][j] = count++;
                }
            }
        }

        for (int[] array : arrayF) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayG() {
        int[][] arrayG = new int[12][10];
        int count = 1;
        for (int i = arrayG.length - 1; i >= 0; i--) {
            for (int j = 0; j < arrayG[i].length; j++) {
                arrayG[i][j] = count++;
            }
        }

        for (int[] array : arrayG) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayH() {
        int[][] arrayH = new int[12][10];
        int count = 1;
        for (int j = arrayH[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < arrayH.length; i++) {
                arrayH[i][j] = count++;
            }
        }

        for (int[] array : arrayH) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayI() {
        int[][] arrayI = new int[12][10];
        int count = 1;
        for (int i = arrayI.length - 1; i >= 0; i--) {
            for (int j = arrayI[i].length - 1; j >= 0; j--) {
                arrayI[i][j] = count++;
            }
        }

        for (int[] array : arrayI) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayK() {
        int[][] arrayK = new int[12][10];
        int count = 1;
        for (int j = arrayK[0].length - 1; j >= 0; j--) {
            for (int i = arrayK.length - 1; i >= 0; i--) {
                arrayK[i][j] = count++;
            }
        }

        for (int[] array : arrayK) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayL() {
        int[][] arrayL = new int[12][10];
        int count = 1;
        for (int i = arrayL.length - 1; i >= 0; i--) {
            if ((i % 2 == 0)) {
                for (int j = arrayL[i].length - 1; j >= 0; j--) {
                    arrayL[i][j] = count++;
                }
            } else {
                for (int j = 0; j < arrayL[i].length; j++) {
                    arrayL[i][j] = count++;
                }
            }
        }

        for (int[] array : arrayL) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayM() {
        int[][] arrayM = new int[12][10];
        int count = 1;
        for (int i = 0; i < arrayM.length; i++) {
            if ((i % 2 == 0)) {
                for (int j = arrayM[i].length - 1; j >= 0; j--) {
                    arrayM[i][j] = count++;
                }
            } else {
                for (int j = 0; j < arrayM[i].length; j++) {
                    arrayM[i][j] = count++;
                }
            }
        }

        for (int[] array : arrayM) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayN() {
        int[][] arrayN = new int[12][10];
        int count = 1;
        for (int j = arrayN[0].length - 1; j >= 0; j--) {
            if ((j % 2 == 0)) {
                for (int i = arrayN.length - 1; i >= 0; i--) {
                    arrayN[i][j] = count++;
                }
            } else {
                for (int i = 0; i < arrayN.length; i++) {
                    arrayN[i][j] = count++;
                }
            }
        }

        for (int[] array : arrayN) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayO() {
        int[][] arrayO = new int[12][10];
        int count = 1;
        for (int j = 0; j < arrayO[0].length; j++) {
            if ((j % 2 == 0)) {
                for (int i = arrayO.length - 1; i >= 0; i--) {
                    arrayO[i][j] = count++;
                }
            } else {
                for (int i = 0; i < arrayO.length; i++) {
                    arrayO[i][j] = count++;
                }
            }
        }

        for (int[] array : arrayO) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayP() {
        int[][] arrayE = new int[12][10];
        int count = 1;
        for (int i = arrayE.length - 1; i >= 0; i--) {
            if (!(i % 2 == 0)) {
                for (int j = arrayE[i].length - 1; j >= 0; j--) {
                    arrayE[i][j] = count++;
                }
            } else {
                for (int j = 0; j < arrayE[i].length; j++) {
                    arrayE[i][j] = count++;
                }
            }
        }

        for (int[] array : arrayE) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printArrayR() {
        int[][] arrayR = new int[12][10];
        int count = 1;
        for (int j = arrayR[0].length - 1; j >= 0; j--) {
            if (!(j % 2 == 0)) {
                for (int i = arrayR.length - 1; i >= 0; i--) {
                    arrayR[i][j] = count++;
                }
            } else {
                for (int i = 0; i < arrayR.length; i++) {
                    arrayR[i][j] = count++;
                }
            }
        }

        for (int[] array : arrayR) {
            for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
