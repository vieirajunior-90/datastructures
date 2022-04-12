package searches;

public class LinearSearch {

    /**
     * Linear Search
     * Complexity: O(n)
     * Space: O(1)
     * @param arr array to search
     * @param number number to search for
     * @param index index to start searching from, default 0. Used for recursion
     * @return index of number if found, -1 if not found or array is empty
     */
    private static int linearSearch(int[]arr, int number, int index) {
        if(arr.length == 0) {
            return -1;
        }

        if (arr[index] == number) {
            return index;
        }

        if(index == arr.length - 1){
            return -1;
        }

        return linearSearch(arr, number, index + 1);
    }

    public static int linearSearch(int[]arr, int number) {
        return linearSearch(arr, number, 0);
    }

    // Driver Program
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 5;
        int result = linearSearch(arr, number);
        System.out.println(result);
    }
}
