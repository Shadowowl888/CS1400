/*-------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Assignment4.java
// SPECIFICATION: This program prompts the user to enter a series of positive integers and will print a message saying if the integer is prime or not. The user is able to end the program by entering the sentinel value of -1. It will then print information regarding the series of integers, such as the maximum number, minumum number, sum of the numbers, count, and average.
// FOR: CS 1400 - ASSIGNMENT #4 
// TIME SPENT: 30 mins
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        // Create a Scanner object and intialize variables
        Scanner scan = new Scanner(System.in);
        int num = 0, sum = 0, count = 0, maxNum = 0, minNum = Integer.MAX_VALUE;

        while (num != -1) {
            // Prompt user to enter an integer
            System.out.println("Enter a positive integer. Enter -1 to quit.");
            num = scan.nextInt();
            
            // Exit the loop if -1 is inputted
            if (num == -1) {
                break;
            }

            // Print if the number is prime or not
            isPrime(num);

            // Find maximum and minimum numebrs
            if (num > maxNum) {
                maxNum = num;
            } else if (num < minNum) {
                minNum = num;
            }
            
            // Calculate sum of numbers
            sum += num;
            // Count each number inputted
            count++;
        }

        // Print information about max number, min number, sum, count, and average
        System.out.println("\nThe maximum positive number is: " + maxNum);
        System.out.println("The minimum positive number is: " + minNum);
        average(sum, count);
    }

    /**
     * The isPrime method checks if the a number is prime and prints a following message with information.
     * @param number The number used to check if it is prime or not.
    */
    public static void isPrime(int number) {
        // Checks if the number is prime
        boolean prime = true;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }
        
        // Print if the number is prime or not
        if (prime) {
            System.out.println("The number " + number + " is a prime number.\n ");
        } else {
            System.out.println("The number " + number + " is not a prime number.\n");
        }
    }
    
    /**
     * The average method calculates the average of a set of numbers using the sum and count and stores it in a variable. It prints an ouput message with the sum, count, and average values.
     * @param sum The value used as the sum of the integers.
     * @param count The number of integers to take the average of.
     */
    public static void average(int sum, int count) {
        double average = (double)sum / count;
        System.out.println("The sum is: " + sum);
        System.out.println("The count of number(s) is: " + count);
        System.out.println("The average is: " + average);
    }
}
