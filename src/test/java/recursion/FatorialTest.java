package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatorialTest {

    @Test
    void fatorial() {
        assertEquals(1, Fatorial.fatorial(0));
        assertEquals(1, Fatorial.fatorial(1));
        assertEquals(2, Fatorial.fatorial(2));
        assertEquals(6, Fatorial.fatorial(3));
        assertEquals(24, Fatorial.fatorial(4));
        assertEquals(120, Fatorial.fatorial(5));
        assertEquals(720, Fatorial.fatorial(6));
        assertEquals(5040, Fatorial.fatorial(7));
        assertEquals(40320, Fatorial.fatorial(8));
        assertEquals(362880, Fatorial.fatorial(9));
        assertEquals(3628800, Fatorial.fatorial(10));
    }

}