package others;

import sorts.QuickSort;

import java.util.Arrays;

public class Find {

    public static int max(int[] arr){
        return max(arr, arr.length);
    }

    public static int min(int[] arr){
        return min(arr, arr.length);
    }

    /**
     * Finds the maximum value in the array
     * @param arr the array to search
     * @param length the length of the array
     * @return the maximum value in the array
     */
    private static int max(int[] arr, int length){
        if(length == 0){
            return length;
        }
        if(arr.length == 1){
            return arr[0];
        }

        QuickSort.quickSort(arr);

        return arr[arr.length - 1];
    }

    /**
     * Finds the minimum value in the array
     * @param arr the array to search
     * @param length the length of the array
     * @return the minimum value in the array
     */
    private static int min(int[] arr, int length){
        if(length == 0){
            return length;
        }
        if(arr.length == 1){
            return arr[0];
        }

        QuickSort.quickSort(arr);

        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1, 3, 5, 7, 6, 9};
        System.out.println(Arrays.toString(arr));
        System.out.println("Max: " + max(arr));
        System.out.println("Min: " + min(arr));
    }
}
