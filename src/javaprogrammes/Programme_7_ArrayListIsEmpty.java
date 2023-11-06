package javaprogrammes;
// Write a Java program to test if an array list is empty or not.

import java.util.ArrayList;
import java.util.List;

public class Programme_7_ArrayListIsEmpty {

    public static void main(String[] args) {
        // Create an Array list
        List<String> list = new ArrayList<>();

        // Checking whether the list is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty. ");
        } else {
            System.out.println("The ArrayList is not empty. ");
        }

        // Add some element to the arraylist
        list.add("Aberdeen");
        list.add("Belfast");
        list.add("Cambridge");
        list.add("Derby");
        list.add("Eastham");

        // Checking again for the list is empty or not
       if (list.isEmpty()) {
           System.out.println("The ArrayList is empty. ");
       } else {
           System.out.println("The ArrayList is not empty. ");
       }
    }
}
