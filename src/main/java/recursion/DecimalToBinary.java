package recursion;

public class DecimalToBinary {

    /**
     * Decimal to Binary
     * @param n decimal number
     * @return binary number
     */
    public static String decimalToBinary(Integer n){
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }

        return decimalToBinary(n / 2) + n % 2;
    }

    // Driver Program
    public static void main(String[] args) {
        System.out.println(decimalToBinary(42));
    }
}
