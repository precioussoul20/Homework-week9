package javaprogrammes;
/* Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
else)
* */

import java.util.HashSet;
import java.util.Set;

public class Programme_8_HashSet {

    public static void main(String[] args) {
        // Create a Hashset to store Integar Objects
        Set<Integer> numberSet = new HashSet<>();

        // Store the number 4, 7, and 8 in the Hashset
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        // Check which number between 1 and 10 are in the set
        System.out.println("Numbers in the set between 1 and 10: ");
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set. ");
            } else {
                System.out.println(i + " is not in the set. ");
            }
        }
    }
}
