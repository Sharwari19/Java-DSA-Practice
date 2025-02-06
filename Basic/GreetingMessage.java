 // Take name as input and print a greeting message for that particular name.
 
 import java.util.*;

 public class GreetingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = scan.next().trim();

        System.out.println("Hello " + name + "!");
    }
 }
