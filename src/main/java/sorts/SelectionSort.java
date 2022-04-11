package sorts;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr, int count){
        if (count == arr.length){
            return arr;
        }

        int min = count;
        for(int i = count; i < arr.length; i++) {
            if(arr[i] < arr[min]){
                min = i;
            }
        }

        int aux = arr[count];
        arr[count] = arr[min];
        arr[min] = aux;

        return selectionSort(arr, count + 1);
    }

    // Driver Program
    public static void main(String[] args) {
        int[] array = new int[]{2,4,5,1,3};
        System.out.println(Arrays.toString(selectionSort(array, 0)));
    }
}
