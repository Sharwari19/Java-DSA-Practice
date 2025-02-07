//  to find all Armstrong numbers in a given range (e.g., 1 to 10000)

import java.util.*;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lowerLimit = scan.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperLimit = scan.nextInt();

        for(int i = lowerLimit; i <= upperLimit; i++) {
            if(isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scan.close();

    }

    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int digitCount = countDigits(num);

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == originalNumber;
    }

    public static int countDigits(int num) {
        int count = 0;

        if (num == 0) {
            count = 1;
        }
        
        while( num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
