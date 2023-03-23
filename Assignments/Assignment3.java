/*-------------------------------------------------------------
 * AUTHOR: Devin Khun
 * FILENAME: Assignmnet3.java
 * SPECIFICATION: This program prompts the user to enter two strings and gives a command options menu. Based on the input from the menu that the user chooses, it will perform a series of different outputs on the two strings. Some of these options are finding the lengths of the strings, finding which string is lexically larger, concantenating the two strings, and printing the upper case version of both strings.
 * FOR: CS1400 - ASSIGNMENT #3
 * TIME SPENT: 1 hour
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        // Create new scanner object
        Scanner scan = new Scanner(System.in);
        // Declare variable to hold the user's choice from the menu
        char userChoice;

        // Prompt the user to enter two strings
        System.out.println("Please enter a string.");
        String string1 = scan.nextLine();
        System.out.println("Please enter another string.");
        String string2 = scan.nextLine();

        // Command Options Menu
        System.out.println("\nCommand Options");
        System.out.println("-----------------------------------");
        System.out.println("a: find if the lengths of the strings are equal");
        System.out.println("b: find if the two strings are the same");
        System.out.println("c: find which string is lexically larger");
        System.out.println("d: print the first character of each string");
        System.out.println("e: concatenate the two strings");
        System.out.println("f: print both strings in uppercase");
        System.out.println("q: quit this program");

        // Continues asking the user to for a input choice until they quit
        do {
            // Prompt user to enter a character choice
            System.out.println("\nPlease, enter an option from the menu.");
            userChoice = scan.next().charAt(0);

            switch(userChoice) {
                // Option A: Compares the lengths of the two strings
                case 'a':
                    if (string1.length() == string2.length()) {
                        System.out.println("The lengths are the same.");
                    } else {
                        System.out.println("The lengths are not the same.");
                    }
                    break;
                // Option B: Compares the equality of the two strings
                case 'b':
                    if (string1.equals(string2)) {
                        System.out.println("The two strings are the same.");
                    } else {
                        System.out.println("The two strings are different.");
                    }
                    break;
                // Option C: Finds which string is lexically larger
                case 'c':
                    if (string1.compareTo(string2) > 0) {
                        System.out.println("The first string is lexically larger.");
                    } else if (string1.compareTo(string2) < 0) {
                        System.out.println("The second string is lexically larger.");
                    } else {
                        System.out.println("The two strings are the same.");
                    }
                    break;
                // Option D: Prints the first character of each string
                case 'd':
                    System.out.println("The first character of the first string is " + string1.charAt(0));
                    System.out.println("The first character of the second string is " + string2.charAt(0));
                    break;
                // Option E: Concatenates the two strings
                case 'e':
                    System.out.println("The concatenation of two strings is \"" + string1 + string2 + "\".");
                    break;
                // Option F: Prints the uppercase version of the two strings
                case 'f':
                    System.out.println("The first string using upper case letters: " + string1.toUpperCase());
                    System.out.println("The second string using upper case letters: " + string2.toUpperCase());
                    break;
                // Option Q: Quits the program
                case 'q':
                    System.out.println("Goodbye!");
                    break;
                // Default Option: Invalid option
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (userChoice != 'q');

        // Close scanner
        scan.close();
    }
}
