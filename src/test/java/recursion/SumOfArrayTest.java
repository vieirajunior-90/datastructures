package recursion;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfArrayTest {

    @Test
    void sumOfArrayTest() {
        int[] array = IntStream.rangeClosed(1, 5).toArray();
        assertEquals(15, SumOfArray.sumOfArray(array));
    }

    @Test
    void sumOfArrayTest2() {
        int[] array = IntStream.rangeClosed(1, 10).toArray();
        assertEquals(55, SumOfArray.sumOfArray(array));
    }

    @Test
    void sumOfArrayTest3() {
        int[] array = IntStream.rangeClosed(1, 100).toArray();
        assertEquals(5050, SumOfArray.sumOfArray(array));
    }

    @Test
    void sumOfArrayTest4() {
        int[] array = IntStream.rangeClosed(1, 1000).toArray();
        assertEquals(500500, SumOfArray.sumOfArray(array));
    }

    @Test
    void sumOfArrayTest5() {
        int[] array = IntStream.rangeClosed(1, 10000).toArray();
        assertEquals(50005000, SumOfArray.sumOfArray(array));
    }

    @Test
    void sumOfArrayTest6() {
        int[] array = IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).toArray();
        assertEquals(30, SumOfArray.sumOfArray(array));
    }

    @Test
    void sumOfArrayTest7() {
        int[] array = IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 1).toArray();
        assertEquals(25, SumOfArray.sumOfArray(array));
    }

    @Test
    void sumOfArrayTest8() {
        int[] array = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).toArray();
        assertEquals(2550, SumOfArray.sumOfArray(array));
    }

    @Test
    void sumOfArrayTest9() {
        int[] array = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 1).toArray();
        assertEquals(2500, SumOfArray.sumOfArray(array));
    }

    @Test
    void sumOfArrayTest10() {
        int[] array = IntStream.rangeClosed(1, 1000).filter(i -> i % 2 == 0).toArray();
        assertEquals(250500, SumOfArray.sumOfArray(array));
    }
}