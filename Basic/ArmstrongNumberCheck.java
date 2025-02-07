// To find Armstrong Number between two given number.

import java.util.*;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Enter the number");
            int num = scan.nextInt();

            if(isArmstrong(num)) 
            {
                System.out.println(num + " is an Armstrong Number");
            }
            else 
            {
                System.out.println(num + " is not an Armstrong Number");
            }

            scan.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = countDigits(num); // get the number of digits

        // int digitCount = String.valueOf(num).length();  converts num to string and gets its length
        // but this approach is slower because uses extra memory for conversion
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }    

        return sum == originalNum;
    }

    public static int countDigits(int num) {
        int count = 0;
        while(num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }


}
