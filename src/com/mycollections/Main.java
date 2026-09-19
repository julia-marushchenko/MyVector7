/**
 *  Java program to create, modify, and display Vector instance.
 */

package com.mycollections;

import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of a Vector.
        Vector<Float> myVector = new Vector<>();

        // Printing myVector size.
        System.out.println("Size: " + myVector.size()); // Output: Size: 0

        // Adding elements.
        myVector.add(1.2F);
        myVector.add(8.2F);
        myVector.add(4.1F);
        myVector.add(1.9F);
        myVector.add(7.3F);

        // Printing myVector size.
        System.out.println("Size: " + myVector.size()); // Output: Size: 5

        // Printing values of myVector.
        System.out.println(myVector); // Output: [1.2, 8.2, 4.1, 1.9, 7.3]

        // Deleting all elements of myVector.
        myVector.clear();

        // Printing myVector size.
        System.out.println("Size: " + myVector.size()); // Output: Size: 0

    }
}
