package recursion;

public class Fatorial {

    /**
     * Recursive function to find factorial of a number
     * @param n the number whose factorial is to be found
     * @return factorial of n
     */
    public static int fatorial(int n) {
        if (n < 1) {
            return 1;
        }

        return n * fatorial(n - 1);
    }

    // Driver Program
    public static void main(String[] args) {
        System.out.println(fatorial(6));
    }
}
