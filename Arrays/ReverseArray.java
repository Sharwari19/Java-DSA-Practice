// this problem uses two pointer method 

package Arrays;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 45, 7, 9, 10};

        System.out.println("Original array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));

    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--; 
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}