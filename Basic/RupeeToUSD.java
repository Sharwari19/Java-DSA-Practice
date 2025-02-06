// Input currency in rupees and output in USD.

import java.util.*;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Amount (in Rupees): ");
        float amountInRupee = scan.nextFloat();

        float amountInUSD = amountInRupee / 81.85f;

        System.out.println("Amount in USD: " + amountInUSD);
    }
}
