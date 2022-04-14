package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedStringTest {

    @Test
    public void testReverseString() {
        assertEquals("", ReversedString.reversedString(""));
        assertEquals("a", ReversedString.reversedString("a"));
        assertEquals("ba", ReversedString.reversedString("ab"));
        assertEquals("cba", ReversedString.reversedString("abc"));
        assertEquals("ynamreg", ReversedString.reversedString("germany"));
        assertEquals("!dlroW olleH", ReversedString.reversedString("Hello World!"));
        assertEquals("tset a si sihT", ReversedString.reversedString("This is a test"));
        assertEquals("nuf si avaJ", ReversedString.reversedString("Java is fun"));
    }

}