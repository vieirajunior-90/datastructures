package binarysearch;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberByIndexTest {

    @Test
    void testBinarySearch() {
        int[] array = IntStream.rangeClosed(1, 1000).toArray();
        int index = NumberByIndex.binary_search(array, 5, 0, array.length - 1);
        assertEquals(4, index);
    }

    @Test
    void testBinarySearch2() {
        int[] array = IntStream.rangeClosed(1, 1000).filter(i -> i % 2 == 0).toArray();
        int index = NumberByIndex.binary_search(array, 200, 0, array.length - 1);
        assertEquals(99, index);
    }

    @Test
    void testBinarySearch3() {
        int[] array = IntStream.rangeClosed(1, 1000).filter(i -> i % 2 != 0).toArray();
        int index = NumberByIndex.binary_search(array, 501, 0, array.length - 1);
        assertEquals(250, index);
    }

}