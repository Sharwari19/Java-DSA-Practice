package Arrays;

import java.util.*;

public class MaxNumInArr {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        int[] arr = {1, 2, 34, 56, 99, 0};

        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 4));
    }

    static int max(int[] arr) {

        if(arr.length == 0) {
            return -1;
        }

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int maxRange(int[] arr, int start, int end) {

        if(end > start) {
            return -1;
        }

        if(arr.length == 0) {
            return -1;
        }

        int max = arr[0];

        for(int i = start; i <= end; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
