package searches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void linearSearch() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = LinearSearch.linearSearch(arr, 3, 0);
        assertEquals(2, result);
    }

    @Test
    void linearSearchNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = LinearSearch.linearSearch(arr, 6, 0);
        assertEquals(-1, result);
    }

    @Test
    void linearSearchEmptyArray() {
        int[] arr = {};
        int result = LinearSearch.linearSearch(arr, 6, 0);
        assertEquals(-1, result);
    }
}