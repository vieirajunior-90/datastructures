package recursion;

import java.util.stream.IntStream;

public class SumOfArray {

    private static int sumOfArray(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex == lastIndex) {
            return arr[firstIndex];
        }
        return arr[firstIndex] + sumOfArray(arr, firstIndex + 1, lastIndex);
    }
    public static int sumOfArray(int[] arr) {
        return sumOfArray(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = IntStream.rangeClosed(1, 10).toArray();
        System.out.println(sumOfArray(arr));
    }
}
