package javaprogrammes;
// Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.

import java.util.ArrayList;
import java.util.List;

public class Programme_4_ColourArrayList {
    public static void main(String[] args) {
        // create a new Arraylist to store colors
        List<String> colours = new ArrayList<>();

        //Add some colours to the Arraylist
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Orange");

        //Print the collection using a for each loop
        System.out.println("Colours in the ArrayList: ");
        for (String colour : colours);
        System.out.println(colours);
    }
}
