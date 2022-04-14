package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertTrue(Palindrome.isPalindrome("kayak"));
        assertTrue(Palindrome.isPalindrome("a"));
        assertTrue(Palindrome.isPalindrome(""));
        assertFalse(Palindrome.isPalindrome("hello"));
        assertFalse(Palindrome.isPalindrome("car"));
        assertFalse(Palindrome.isPalindrome("soccer"));
        assertTrue(Palindrome.isPalindrome("330033"));
        assertTrue(Palindrome.isPalindrome("0"));
        assertTrue(Palindrome.isPalindrome("12321"));
    }

    void testPalindromeInteger() {
        assertTrue(Palindrome.isPalindrome(330033));
        assertTrue(Palindrome.isPalindrome(0));
        assertTrue(Palindrome.isPalindrome(12321));
        assertFalse(Palindrome.isPalindrome(330032));
        assertFalse(Palindrome.isPalindrome(1));
        assertFalse(Palindrome.isPalindrome(123210));
        assertTrue(Palindrome.isPalindrome(999000999));
    }

}