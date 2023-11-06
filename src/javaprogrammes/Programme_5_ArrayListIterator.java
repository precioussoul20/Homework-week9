package javaprogrammes;
// Write a Java program to iterate through all elements in an array list using
//Iterater.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Write a Java program to iterate through all elements in an array list using
//Iterater
public class Programme_5_ArrayListIterator {
    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        List<String> myList = new ArrayList<>();
        myList.add("Aberdeen");
        myList.add("Belfast");
        myList.add("Cambridge");
        myList.add("Derby");

        // Create an Iterator to iterate through the ArrayList
        Iterator<String> iterator = myList.iterator();

        // use a while loop to iterate through the elements
        System.out.println("Iterating through the ArrayList using Iterator: ");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
