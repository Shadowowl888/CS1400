/*-------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Lab3.java
// SPECIFICATION: This program prompts the user to enter three grades, homework grade, midterm exam grade, and final exam grade. It will give the user 3 additional tries if the input is invalid for each grade input. It will then output the total weighted grade and a message if the user passed or failed the class. If the user's input was invalid for more than 3 tries, it prompts them to restart the program.
// FOR: CS 1400- Lab #3
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        // Declare three variables for HW, midterm, and final exam grades
        // -->
        double homeworkGrade = 0, midtermGrade = 0, finalGrade = 0;
        int homeworkChances = 3, midtermChances = 3, finalChances = 3;
        // Declare a loop control variable i
        // -->
        int i = 0;

        while (i < 3) {
            // Design if-else control flow:
            //
            // if i is 0, asks for the homework grade
            // if i is 1, asks for the midterm exam grade
            // if i is 2, asks for the final exam grade
            //
            // You have to let the user re-try if any of the inputs is invalid.
            // - homework grade is in [0, 100]
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
            //
            // The first if-else statement is attached for your reference. You have to
            // finish the last two statments by yourself.

            if (i == 0) {
                // Ask the user for homework grade
                // -->
                if (homeworkChances == 3) {
                    System.out.println("Enter your HOMEWORK grade: ");
                    homeworkGrade = scanner.nextDouble();
                }

                // Do input validation
                // -->
                if (homeworkGrade < 0 || homeworkGrade > 100) {
                    // Show the error message
                    // -->
                    System.out.println("[ERR] Invalid input. A homework grade should be in [0,100].");
                    // Give the user 3 chances to enter a valid input for homework grade
                    if (homeworkChances > 0) {
                        homeworkChances--;
                        System.out.println("\nEnter your HOMEWORK grade (" + homeworkChances + " chance(s) left): ");
                        homeworkGrade = scanner.nextDouble();
                    } else {
                        // Terminate the loop after three tries
                        break;
                    }
                } else {
                    // Update the loop variable
                    // -->
                    i++;
                }
            }   
            // The other two if statements go here
            // -->

            if (i == 1) {
                // Ask the user for the midterm exam grade
                if (midtermChances == 3) {
                    System.out.println("\nEnter your MIDTERM EXAM grade: ");
                    midtermGrade = scanner.nextDouble();
                }
                
                // Do input validation
                if (midtermGrade < 0 || midtermGrade > 100) {
                    // Show the error message
                    System.out.println("[ERR] Invalid input. A midterm grade should be in [0,100].");
                    // Give the user 3 chances to enter a valid input for midterm exam grade
                    if (midtermChances > 0) {
                        midtermChances--;
                        System.out.println("\nEnter your MIDTERM EXAM grade (" + midtermChances + " chance(s) left): ");
                        midtermGrade = scanner.nextDouble();
                    } else {
                        // Terminate the loop after three tries
                        break;
                    }
                } else {
                    // Update the loop variable
                    i++;
                }
            }
        
            if (i == 2) {
                // Ask the user for final exam grade
                if (finalChances == 3) {
                    System.out.println("\nEnter your FINAL EXAM grade: ");
                    finalGrade = scanner.nextDouble();
                }

                // Do input validation
                if (finalGrade < 0 || finalGrade > 200) {
                    // Show the error message
                    System.out.println("[ERR] Invalid input. A final grade should be in [0,200].");
                    // Give the user 3 chances to enter a valid input for final exam grade
                    if (finalChances > 0) {
                        finalChances--;
                        System.out.println("\nEnter your FINAL EXAM grade (" + finalChances + " chance(s) left): ");
                        finalGrade = scanner.nextDouble();
                    } else {
                        // Terminate the loop after three tries
                        break;
                    }
                } else {
                    // Update the loop variable
                    i++;
                }
            }
        }

        // Calculate the weighted total by the formula showed in the PDF
        // -->
        double weighted_total = ((finalGrade / 200 * 50) + (midtermGrade * 0.25) + (homeworkGrade * 0.25));

        // Show the weighted total and tell the user s/he passed or not
        // -->
        if (homeworkChances != 0 && midtermChances != 0 && finalChances != 0) {
            System.out.println("\n[INFO] Student's Weighted Total is " + weighted_total);
            if (weighted_total >= 50) {
                // Print "the student PASSED the class."
                System.out.println("[INFO] Student PASSED the class");
            } else {
                // Print "the student FAILED the class."
                System.out.println("[INFO] Student FAILED the class");
            }
        } else {
            System.out.println("\n[ERR] You have retried 3 times. Please restart your program.");
        }

        scanner.close();

    }  // End of main
}  // End of class
