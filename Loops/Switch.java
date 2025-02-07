package Loops;

import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.print("Enter a fruit name: ");
        // String fruit = scan.next();

        // switch (fruit) {
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;

        //     case "Apple":
        //         System.out.println("A sweet red fruit");
        //         break;

        //     case "Orange":
        //         System.out.println("Round citrus fruit");
        //         break;

        //     case "Grapes":
        //         System.out.println("Sour small fruit");
        //         break;
        
        //     default:
        //         System.out.println("Please enter a valid fruit");
        //         break;
        // }



        // enhanced switch case syntax

        // switch (fruit) {
        //     case "Mango" -> System.out.println("King of fruits");
        //     case "Apple" -> System.out.println("A sweet red fruit");
        //     case "Orange" -> System.out.println("Round citrus fruit");
        //     case "Grapes" -> System.out.println("Sour small fruit");
        //     default -> System.out.println("Please enter a valid fruit");
        // }

        System.out.print("Enter a day: ");
        int day = scan.nextInt();

        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }


        // switch (day) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("Weekday");
        //         break;
            
        //     case 6:
        //     case 7:
        //         System.out.println("Weekend");
        //         break;
        // }


        // enhanced switch 

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
