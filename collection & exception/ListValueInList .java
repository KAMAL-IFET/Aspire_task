package Collectionss;



import java.util.ArrayList;
import java.util.List;

public class ListValueInList {

    public static void main(String[] args) {
        // Create a list and add elements to it
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(8); // Duplicate element

        int n = 5;
        // Check if the list contains the value
        if (list.contains(n)) {
            System.out.println(n + " is present in the list.");
        } else {
            System.out.println(n + " is not present in the list.");
        }

        // Print the list
        System.out.println(list);
    }
}

