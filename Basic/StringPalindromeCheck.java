// To find out whether the given String is Palindrome or not.

import java.util.*;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string to be checked");
        String inputString = scan.nextLine().trim();
        // char inputArr[] = inputString.toCharArray();

        // String concatenation inside a loop (+=) is inefficient 
        // because strings are immutable in Java. 
        // Every iteration creates a new string object, 
        // increasing memory usage and slowing down execution.

        // so use StringBuilder 

        StringBuilder reversedString = new StringBuilder();

        for(int i = inputString.length() - 1; i >= 0; i--) {
            reversedString.append(inputString.charAt(i));
        }

        // convert stringbuilder to string to use inbuilt methods and ignore cases
        if(reversedString.toString().equalsIgnoreCase(inputString)) 
        {
            System.out.println("The given string is a Palindrome");
        }
        else 
        {
            System.out.println("The given string is not a Palindrome");
        }

        scan.close(); // close scanner to prevent memory leaks
    }
}
