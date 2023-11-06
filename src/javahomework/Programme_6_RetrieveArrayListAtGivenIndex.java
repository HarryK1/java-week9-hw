package javahomework;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveArrayListAtGivenIndex {

    public static void elementArray() {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("Element 1");
        elements.add("Element 2");
        elements.add("Element 3");
        elements.add("Element 4");
        elements.add("Element 5");

        //Specify the index of the element you want to retrieve
        int indexToRetrieve = 2; // index 2 corresponds to "Element 3"

        //check if the specified index is valid
        if (indexToRetrieve >= 0 && indexToRetrieve < elements.size()) {
            //Retrieve the element at the specified index
            String element = elements.get(indexToRetrieve);
            System.out.println("Elements at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (elements.size() - 1));
        }

    }

    public static void main(String[] args) {
        elementArray();
    }
}
