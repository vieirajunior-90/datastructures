package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {
        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
        assertEquals(13, Fibonacci.fibonacci(7));
        assertEquals(21, Fibonacci.fibonacci(8));
        assertEquals(34, Fibonacci.fibonacci(9));
        assertEquals(55, Fibonacci.fibonacci(10));
        assertEquals(89, Fibonacci.fibonacci(11));
        assertEquals(144, Fibonacci.fibonacci(12));
        assertEquals(233, Fibonacci.fibonacci(13));
        assertEquals(377, Fibonacci.fibonacci(14));
        assertEquals(610, Fibonacci.fibonacci(15));
        assertEquals(987, Fibonacci.fibonacci(16));
        assertEquals(1597, Fibonacci.fibonacci(17));
        assertEquals(2584, Fibonacci.fibonacci(18));
        assertEquals(4181, Fibonacci.fibonacci(19));
        assertEquals(6765, Fibonacci.fibonacci(20));
        assertEquals(10946, Fibonacci.fibonacci(21));
        assertEquals(17711, Fibonacci.fibonacci(22));
        assertEquals(28657, Fibonacci.fibonacci(23));
        assertEquals(46368, Fibonacci.fibonacci(24));
        assertEquals(75025, Fibonacci.fibonacci(25));
    };
}