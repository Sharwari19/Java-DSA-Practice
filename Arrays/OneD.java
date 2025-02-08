package Arrays;

import java.util.*;

public class OneD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // int[] rnos = new int[5];

        int[] rnos2 = {23, 12, 45, 32, 19};

        int[] ros; // declaration of array, ros is getting defined in stack
        ros = new int[4]; // actually here object is being created in the memory(heap)

        System.out.println(ros[1]); // 0 because not initialised yet

        String[] arr = new String[4];
        System.out.println(arr[0]);     // null because reference is not assigned with any object yet and empty references point to null in heap memory
        

        // String str = null;
        // int num = null; //Error cannot assign to primitives

        int[] arr2 = new int[5];

        // array input using for loop
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        // print array element using for loop
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }

        // for-each loop 
        for(int num: arr2) {
            System.out.println(num + " "); // here num represents individual element of the array arr2
        }

        // System.out.println(arr2[5]);  // array index out of bound error

        // easy way to print
        System.out.println(Arrays.toString(arr2)); 

        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums)); //mutable behaviour
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
