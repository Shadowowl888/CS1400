/*-------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Lab6.java
// SPECIFICATION: This program prompts the user to enter the number of elements in the array and delcares an array with values inputted by the user. It then calculates the sum of the values in the array and displays the values in the array backward from when they were inputted. The sum of the values are displayed at the end.
// FOR: CS 1400 - Lab #6
// TIME SPENT: 20 mins
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab6
{
    public static void main(String[] args)
    {
        // ========== Declaring variables ==========

        // An integer for the array size.
        // -->
        int arraySize = 0;

        // A double for the current element.
        // -->
        double currentElement = 0;

        // A double for the sum of elements.
        // -->
        double sumOfElements = 0;

        // A scanner object for requesting input from System.in.
        // -->
        Scanner scan = new Scanner(System.in);


        // ========== Request Array size from user ==========

        // Print this message "How many elements in the array?"
        // -->
        System.out.println("How many elements in the array?");

        // Request an integer from the user using the Scanner object
        // and store the inputted value in the integer declared above.
        // -->
        arraySize = scan.nextInt();


        // ========== Declare the array ==========

        // Declare a new array of size equal to the size requested
        // -->
        double[] doubleArray = new double[arraySize];

        // For reference, the following is an EXAMPLE declaration of an

        // integer array of a fixed size. DO NOT USE THIS ARRAY.
        // int[] integerArray = new int[25];


        // ========== Fill in the array ==========

        for(int i = 0; i < arraySize; i++) {

            // Display the message: "Please enter the next value."
            // -->
            System.out.println("Please enter the next value.");

            // Request the next element (double) from the user using
            // the Scanner object.
            // -->
            currentElement = scan.nextDouble();

            // Store this element at the ith position of the array
            // -->
            doubleArray[i] = currentElement;
        }


        // ========== Display and sum the array's elements ==========

        // Construct a for loop that runs backwards through the array,
        // starting at the last element and ending at the first.

        for (int i = arraySize-1; i >= 0; i--) {

            // Inside this for loop, print the ith element of the array
            // and a tab, with NO newline characters.
            // -->
            System.out.print(doubleArray[i] + "  ");

            // If this element is the 8th one on its line, print a
            // newline character to advance to the next line.
            // Also inside this for loop, add the value of the ith
            // element to the current value of the double for the sum
            // of elements.
            // -->
            sumOfElements += doubleArray[i];

        }


        // ========== Display the sum ==========

        // Print the following message to the user, preceded by a
        // newline character.
        // "The sum of the array's elements is: <sum>"
        // -->
        System.out.println("\nThe sum of the array's elements is: " + sumOfElements);

    } // Close the main function.
} // Close the Lab6 class.