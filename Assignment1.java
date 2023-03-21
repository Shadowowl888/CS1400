/*
 * AUTHOR: Devin Khun
 * FILENAME: Assignmnet1.java
 * SPECIFICATION: Prompt the user to enter distances for three javelin throws, and print out the conversions for each of the three distances into different units.
 * FOR: CS1400 - ASSIGNMENT #1
 * TIME SPENT: 1.5 hours
*/

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // Create scanner object
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a name
        System.out.print("Enter the competitor's name: ");
        String name = scan.nextLine();
        System.out.printf("\n\t\t%s\n\t%s%s\n\n", "Olympic Javelin Throws", "Enter the distances, in meters, for ", name);

        // Prompt user to enter distances for three throws
        System.out.print("Please enter the distance for throw 1: ");
        double throw1 = scan.nextDouble();
        System.out.print("Please enter the distance for throw 2: ");
        double throw2 = scan.nextDouble();
        System.out.print("Please enter the distance for throw 3: ");
        double throw3 = scan.nextDouble();
        
        // Print out conversions
        System.out.printf("\n%-16s%-16s%-16s%-16s\n", "Yards", "Feet", "Inches", "Cm");
        System.out.printf("%-16.2f%-16.2f%-16.2f%-16.2f\n", throw1 * 1.093, throw1 * 1.093 * 3, throw1 * 1.093 * 3 * 12, throw1 * 100);
        System.out.printf("%-16.2f%-16.2f%-16.2f%-16.2f\n", throw2 * 1.093, throw2 * 1.093 * 3, throw2 * 1.093 * 3 * 12, throw2 * 100);
        System.out.printf("%-16.2f%-16.2f%-16.2f%-16.2f\n", throw3 * 1.093, throw3 * 1.093 * 3, throw3 * 1.093 * 3 * 12, throw3 * 100);

        // Cllose scanner
        scan.close();
    }
}
