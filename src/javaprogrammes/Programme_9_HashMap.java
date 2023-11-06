package javaprogrammes;
// Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {
    public static void main(String[] args) {
        // Create a HashMap to store string keys and Integar values
        Map<String, Integer> people = new HashMap<>();

        // Add key values pairs to the HashMap
        people.put("King", 40);
        people.put("Queen", 38);
        people.put("Prince", 41);
        people.put("Princess", 27);

        //Iterate over the value using a for each loop
        for (int age : people.values()) {
            System.out.println("Age:" + age);
        }
    }
}
