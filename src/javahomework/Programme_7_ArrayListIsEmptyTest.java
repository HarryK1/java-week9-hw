package javahomework;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayListIsEmptyTest {

    public static void isEmptyArray() {
        //create an arraylist
        List<String> names = new ArrayList<>();

        //check if ArrayList is empty
        if (names.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        //Add some elements to ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        //check if the ArrayList is empty again
        if (names.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }

    public static void main(String[] args) {
    isEmptyArray();
    }
}
