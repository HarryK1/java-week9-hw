package javahomework;

import java.util.ArrayList;

/*
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ColoursArrayList {
    public static void colourArray() {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Blue");
        colourList.add("Green");
        colourList.add("Yellow");
        colourList.add("Black");
        colourList.add("White");
        colourList.add("Orange");
        colourList.add("Purple");
        colourList.add("Cyan");

        for (String colours : colourList) {
            System.out.println(colourList + ", ");
        }
    }


    public static void main(String[] args) {
    colourArray();
    }
}

