// To calculate Fibonacci Series up to n numbers.

import java.util.*;

public class FibonacciUptoN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of Fibonacci terms to generate");

        int termsToGenerate = scan.nextInt();

        int a = 0;
        int b = 1;
    
        for(int i = 1; i <= termsToGenerate; i++){
            System.out.println(a);
            int temp = b;
            b = a + b;
            a = temp;
        }
    }
}
