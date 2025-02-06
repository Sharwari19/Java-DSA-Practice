// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int max = num1;

        if(num2 > max) {
            max = num2;
        }

        System.out.println("Largest number: " + max);
    }
}
