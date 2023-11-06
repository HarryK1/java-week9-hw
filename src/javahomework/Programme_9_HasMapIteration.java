package javahomework;

import java.util.HashMap;
import java.util.Map;

/*
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HasMapIteration {
    public static void storeKeyAndValue() {
        //create a HashMap to Store String keys and Integer values
        Map<String, Integer> people = new HashMap<>();

        //Add come key value pairs to the map
        people.put("Alice", 30);
        people.put("Bob", 25);
        people.put("Charlie", 35);
        people.put("David", 40);

        //use a for each loop
        System.out.println("Values in the HashMap: ");
        for (Integer age : people.values()) {
            System.out.println(age);
        }
    }


    public static void main(String[] args) {
        storeKeyAndValue();
    }
}