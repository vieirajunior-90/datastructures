package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {

    @Test
    void testDecimalToBinary() {
        assertEquals("0", DecimalToBinary.decimalToBinary(0));
        assertEquals("1000", DecimalToBinary.decimalToBinary(8));
        assertEquals("10000", DecimalToBinary.decimalToBinary(16));
        assertEquals("100000", DecimalToBinary.decimalToBinary(32));
        assertEquals("1000000", DecimalToBinary.decimalToBinary(64));
        assertEquals("10000000", DecimalToBinary.decimalToBinary(128));
        assertEquals("11111111", DecimalToBinary.decimalToBinary(255));
        assertEquals("100000000", DecimalToBinary.decimalToBinary(256));
    }

}