package Arrays;

import java.util.*;

public class SearchingInArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        names.add("Sharwari");
        names.add("Mithilesh");
        names.add("Ayush");
        names.add("Riddhi");
        names.add("Akanksha");

        System.out.println("Enter name to search in the list");
        String input = scan.nextLine();

        // searching for the element
        // indexOf(input) return the index of the first occurence of the element
        // if element isn't found, it returns -1
        int index = names.indexOf(input);

        // print the result
        if(index != -1) {
            System.out.println(input + " found at index: " + index);
        }
        else {
            System.out.println(input + " not found in the list");
        }

        scan.close();

    }
}
