package recursion;

import java.util.stream.IntStream;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }

        return false;
    }

    public static boolean isPalindrome(Integer n) {
        if (n < 0) {
            return false;
        }

        if (n == 0) {
            return true;
        }

        return isPalindrome(n / 10) && n % 10 == n / 10 % 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
    }
}
