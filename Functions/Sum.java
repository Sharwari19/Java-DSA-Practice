// Function to add two numbers

package Functions;

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers to add: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = calculateSum(num1, num2);
        System.out.println("Sum is: " + result);
    }

    public static int calculateSum(int num1, int num2) {
        int answer = num1 + num2;

        return answer;
    }
}
