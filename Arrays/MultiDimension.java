package Arrays;

import java.util.*;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            1 2 3
            4 5 6
            7 8 9
         */

        int[][] arr = new int[3][];
         // adding no. of rows is mandatory 
         // adding no. of columns is optional

        int[][] arr2D = {
            {1, 2, 3},  // 0th index
            {4, 5},     // 1st index
            {6, 7, 8, 9}   // 2nd index
        };


        //input 

        // for each row
        for(int row = 0; row < arr2D.length; row++) {

            // for each col in a row
            for(int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = scan.nextInt();
            }
        }


        //output 

        // for each row
        for(int row = 0; row < arr2D.length; row++) {

            // for each col in a row
            for(int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }

            System.out.println();
        }


        for(int row = 0; row < arr2D.length; row++) {

            // for each col in a row
            System.out.println(Arrays.toString(arr2D[row]));
            
        }

        // enhanced for loop 
        for(int[] innerArr : arr2D) {
            // for each col in a row
            System.out.println(Arrays.toString(innerArr));
            
        }



    }
}
