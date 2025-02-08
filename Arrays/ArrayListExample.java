package Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        // adding elements
        list.add(67);
        list.add(234);
        list.add(987);
        list.add(607);
        list.add(7);

        // accessing element
        System.out.println("Fourth integer: " + list.get(3)); // 607

        // print list
        System.out.println(list);

        // removing an element
        list.remove(4);

        // size of the list
        System.out.println("Size of ArrayList: "+ list.size()); // 4

        // looping through elements
        for(int num: list) {
            System.out.println(num);
        }
    }
    
}
