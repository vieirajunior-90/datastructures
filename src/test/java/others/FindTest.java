package others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTest {

    @Test
    void testFindMax() {
        int[] arr = {4, 3, 5, 6, 7, 8, 9, 1, 2};
        assertEquals(9, Find.max(arr));
    }

    @Test
    void testFindMin() {
        int[] arr = {4, 3, 5, 6, 7, 8, 9, 1, 2};
        assertEquals(1, Find.min(arr));
    }

    @Test
    void testFindMax2() {
        int[] arr = {154, 543, 764, 876, 987, 123, 456, 789, 987, 123};
        assertEquals(987, Find.max(arr));
    }

    @Test
    void testFindMin2() {
        int[] arr = {154, 543, 764, 876, 987, 123, 456, 789, 987, 123};
        assertEquals(123, Find.min(arr));
    }

    @Test
    void testFindMax3() {
        int[] arr = {};
        assertEquals(0, Find.max(arr));
    }

    @Test
    void testFindMin3() {
        int[] arr = {};
        assertEquals(0, Find.min(arr));
    }

    @Test
    void testFindMax4() {
        int[] arr = {1};
        assertEquals(1, Find.max(arr));
    }

    @Test
    void testFindMin4() {
        int[] arr = {1};
        assertEquals(1, Find.min(arr));
    }

}