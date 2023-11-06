package javaprogrammes;
// Write a Java program to retrieve an element (at a specified index) from a given
//array list

import java.util.ArrayList;
import java.util.List;

public class Programme_6_RetrieveElementAtIndex {

    public static void main(String[] args) {
        // create a new arraylist and some elements
        List<String> myList = new ArrayList<>();
        myList.add("Dog");
        myList.add("Cat");
        myList.add("Rabbit");
        myList.add("Hamster");

        //Specify the index from which you want to retrieve the element
        int indexToRetrieve = 2; // Retrieve the element at index 2("Rabbit")
        // Check if the specified index is valid
        if (indexToRetrieve >= 0 && indexToRetrieve < myList.size()){
            String element = myList.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + " : " + element);
        } else {
            System.out.println("Index is out of bounds. ");
        }
    }
}
