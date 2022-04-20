package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSquareTest {

    @Test
    void testMinimumSquareTest() {
        // Assert String
        assertEquals("Square: 80m² - Quantity: 168", MinimumSquare.calcSquares(1680, 640));
        assertEquals("Square: 100m² - Quantity: 10", MinimumSquare.calcSquares(1000, 100));
        assertEquals("Square: 50m² - Quantity: 341", MinimumSquare.calcSquares(1550, 550));
        assertEquals("Square: 600m² - Quantity: 10", MinimumSquare.calcSquares(3000, 1200));
        assertEquals("Square: 10m² - Quantity: 424190", MinimumSquare.calcSquares(8450, 5020));
        assertEquals("Square: 6000m² - Quantity: 200", MinimumSquare.calcSquares(150000, 48000));
    }

}