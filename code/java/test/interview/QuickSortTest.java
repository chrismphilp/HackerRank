package interview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    private QuickSort quicksort;

    @Before
    public void setup() {
        quicksort = new QuickSort();
    }

    @Test
    public void quicksort_should_return_correct_array() {
        int[] testArrayOne = {5, 3, 1, 7, 8, 4, 2};
        quicksort.quicksortArray(testArrayOne, 0, testArrayOne.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 7, 8}, testArrayOne);

        int[] testArrayTwo = {1, 5, 1, 4, 5, 6, 8};
        quicksort.quicksortArray(testArrayTwo, 0, testArrayTwo.length - 1);
        assertArrayEquals(new int[]{1, 1, 4, 5, 5, 6, 8}, testArrayTwo);
    }
}
