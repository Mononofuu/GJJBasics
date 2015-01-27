package sort;

public class QuickSort {
    public static void sort(int[] target) {
        if (target.length > 1) {
            quickSort(target, 0, target.length - 1);
        }
    }

    private static void quickSort(int[] target, int left, int right) {
        if (left == right) return;
        int i = part(target, left, right);
        if (left < i) {
            quickSort(target, left, i - 1);
        }
        if (i < right) {
            quickSort(target, i, right);
        }

    }

    private static int part(int[] target, int left, int right) {
        int i = left;
        int j = right;
        int pivot = target[(left + right) / 2];
        int tmp;

        while (i <= j) {
            while (target[i] < pivot) {
                i++;
            }
            while (target[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = target[i];
                target[i] = target[j];
                target[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}
