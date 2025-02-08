package Arrays;

import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 60};

        System.out.println("Original array: " + Arrays.toString(arr));

        swap(arr, 1, 3);

        System.out.println("Swapped array: " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
