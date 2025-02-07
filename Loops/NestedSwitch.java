package Loops;

import java.util.*;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empID = scan.nextInt();

        System.out.print("Enter the Employee Department: ");
        String department = scan.next(); 

        // switch (empID) {
        //     case 1:
        //         System.out.println("Kunal Khushwaha");
        //         break;

        //     case 2:
        //         System.out.println("Rahul Tiwari");
        //         break;

        //     case 3:
        //         System.out.println("Sharwari Gole");
        //         switch (department) {
        //             case "IT":
        //                 System.out.println("IT Department");
        //                 break;

        //             case "Management":
        //                 System.out.println("Management Department");
        //                 break;

        //             default:
        //                 System.out.println("No department specified");
        //         }
        //         break;

        //     default: 
        //         System.out.println("Enter correct Employee ID");
        // }

        // using enhanced switch

        switch (empID) {
            case 1 -> System.out.println("Kunal Khushwaha");
            case 2 -> System.out.println("Rahul Tiwari");
            case 3 -> {
                System.out.println("Sharwari Gole");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department specified");
                }
            }
            default -> System.out.println("Enter correct Employee ID");
        }
    }
}
