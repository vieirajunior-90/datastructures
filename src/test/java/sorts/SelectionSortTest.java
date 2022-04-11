package sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void testSelectionSort() {
        int[] arr = {4,3,2,1};
        SelectionSort.selectionSort(arr, 0);
        assertArrayEquals(new int[]{1,2,3,4}, arr);
    }

    @Test
    void testSelectionSort2() {
        int[] arr = {5,2,3,1,4};
        SelectionSort.selectionSort(arr, 0);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    void testSelectionSort3() {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort.selectionSort(arr, 0);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, arr);
    }

}