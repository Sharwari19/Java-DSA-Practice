package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicArrayListOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        // adding 5 number
        // intList.add(10);
        // intList.add(20);
        // intList.add(30);
        // intList.add(40);
        // intList.add(50);

        for(int i = 0; i < 5; i++) {
            intList.add(scan.nextInt());
        }

        System.out.println(intList.contains(60));

        intList.set(0, 99);

        // printing list
        System.out.println(intList);

        // removing 3rd element
        intList.remove(2); // 30 removed

        // print modified list
        System.out.println(intList);
    }
}
