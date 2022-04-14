package recursion;

public class ReversedString {

    public static String reversedString(String input) {
        if(input.equals("")) {
            return "";
        }

        return reversedString(input.substring(1)) + input.charAt(0);
    }

    // Driver Program
    public static void main(String[] args) {
        String input = "Hello";
        String reversedInput = reversedString(input);

        System.out.println(reversedInput);

    }


}
