// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to check");

        int input = scan.nextInt();

        if(input % 2 == 0) 
        {
            System.out.println(input + " is Even");
        }
        else 
        {
            System.out.println(input + " is Odd");
        }

        scan.close();
    }
}
