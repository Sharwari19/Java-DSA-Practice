// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter initial principal balance (P):");
        float principal = scan.nextFloat();

        System.out.print("Enter time in years (T):");
        float time = scan.nextFloat();

        System.out.print("Enter annual rate of interest (R in %):");
        float rate = scan.nextFloat();

        float simpleInterest = (principal * rate * time) / 100 ;

        // %.2 format specifier displays answer upto 2 decimal places, f for float,
        // %n for new line (\n) but platform - independent, works on mac, windows, linux
        System.out.println("Simple Interest: %.2f%n" + simpleInterest); 

        scan.close();

    }
}