package Arrays;

import java.util.*;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        // initialisation
        for(int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                list.get(i).add(scan.nextInt());
            }
        }

        System.out.println(list);
    }
}
