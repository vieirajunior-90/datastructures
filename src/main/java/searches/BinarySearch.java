package searches;

public class BinarySearch {

    /**
     * Binary Search Algorithm
     * Complexity: O(log n)
     * Space: O(1)
     * If you are interested in the details of the algorithm, please refer to the following link:
     * https://www.geeksforgeeks.org/binary-search/
     * @param arr array to search
     * @param number number to search for
     * @param start start index of array, we start at 0
     * @param end end index of array, we end at length - 1
     * @return index of number if found, -1 if not found
     */
    public static int binarySearch(int[] arr, int number, int start, int end){
        int mid = (start + end) / 2;

        if (start > end){
            return -1;
        }

        if(number > arr[mid]){
            start = mid + 1;
        }
        else if(number < arr[mid]){
            end = mid - 1;
        }
        else{
            return mid;
        }

        return binarySearch(arr, number, start, end);
    }

    // Driver Program
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 7, 9, 10, 12, 22, 28, 39, 45, 50, 66, 69, 72, 78, 80, 87, 90, 93, 99};

        int x = binarySearch(nums, 12, 0, nums.length - 1);

        if(x >= 0){
            System.out.println("Number found at index: " + x);
        }
        else {
            System.out.println("Number not found");

        }
    }
}
