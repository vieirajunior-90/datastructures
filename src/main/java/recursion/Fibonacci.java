package recursion;

import java.util.Arrays;

public class Fibonacci {

    /**
     * Fibonacci Recursion
     * @param x first number - default 0
     * @param y second number - default 1
     * @param n number of iterations
     * @return the nth number in the fibonacci sequence
     */
    private static int fibonacci(int x, int y, int n) {

        if(n == 0) {
            return x;
        }
        else if(n == 1) {
            return y;
        }
        else {
            return fibonacci(y, x + y, n - 1);
        }
    }

    /**
     * Fibonacci Recursion
     * @param n the index of the fibonacci sequence
     *
     */
    public static int fibonacci(int n) {
        int x = 0;
        int y = 1;
        return fibonacci(x, y, n);
    }


        // Driver Program
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }
}
