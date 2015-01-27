package sort;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

    @Test
    public void testGeneralArray(){
        int[] collection = {1, 5, 6, 10, 4, -5};
        sort(collection);

        isSorted(collection);
    }

    @Test
    public void testEmptyArray(){
        int[] collection = new int[0];
        sort(collection);

        isSorted(collection);
    }

    @Test
    public void testSingleItem(){
        int[] collection = {1};
        sort(collection);

        isSorted(collection);
    }

    @Test
    public void testSomeNegatives(){
        int[] collection = {-3, -1, -5, -10};
        sort(collection);

        isSorted(collection);
    }

    @Test
    public void testSomePositives(){
        int[] collection = {3, 1, 5, 10, 3};
        sort(collection);

        isSorted(collection);
    }

    @Test
    public void testManyDuplicates(){
        int[] collection = {3, 1, 3, 8, 1, 3, 8, 9, 3};
        sort(collection);

        isSorted(collection);
    }

    @Test
    public void testAllDuplicates(){
        int[] collection = {3, 3, 3, 3};
        sort(collection);

        isSorted(collection);
    }

    @Test
    public void testBigSortedArray(){
        int[] collection = new int[100000];

        for (int i=0; i<collection.length; i++) {
            collection[i] = i;
        }

        sort(collection);

        isSorted(collection);
    }

    @Test
    public void testBigReversedSortedArray(){
        int[] collection = new int[100000];

        for (int i=0; i<collection.length; i++) {
            collection[i] = collection.length - i;
        }

        sort(collection);

        isSorted(collection);
    }

    @Test
    public void testBigRandomArray(){
        int[] collection = new int[100000];

        Random random = new Random(100);

        for (int i=0; i<collection.length; i++) {
            collection[i] = random.nextInt();
        }

        sort(collection);

        isSorted(collection);
    }

    private void isSorted(int[] collection) {
        for (int i=0; i<collection.length - 1; i++) {
            if (collection[i] > collection[i+1]){
                Assert.fail("Array is not sorted: " + Arrays.toString(collection));
            }
        }
    }

    private void sort(int[] collection) {
        MergeSort.sort(collection);
    }
}