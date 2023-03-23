/*-------------------------------------------------------------
 * AUTHOR: Devin Khun
 * FILENAME: Assignmnet2.java
 * SPECIFICATION: This program simulates a rock, paper, and scissors game where it asks for each of the players' choices and prints out the result of the game.
 * FOR: CS1400 - ASSIGNMENT #2
 * TIME SPENT: 30 min
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // Create a new scanner object
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the choices for each player
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1Choice = scan.nextLine();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2Choice = scan.nextLine();
        
        // Change user input into all lower case characters
        player1Choice = player1Choice.toLowerCase();
        player2Choice = player2Choice.toLowerCase();

        // Decision tree to decide the result of the game
        if ((player1Choice.equals("rock") && player2Choice.equals("scissors")) || (player1Choice.equals("paper") && player2Choice.equals("rock")) || (player1Choice.equals("scissors") && player2Choice.equals("paper"))) {
            System.out.println("Player 1 wins.");
        } else if ((player1Choice.equals("scissors") && player2Choice.equals("rock")) || (player1Choice.equals("rock") && player2Choice.equals("paper")) || (player1Choice.equals("paper") && player2Choice.equals("scissors"))) {
            System.out.println("Player 2 wins.");
        } else if (player1Choice.equals(player2Choice)) {
            System.out.println("It is a tie.");
        } else {
            System.out.println("Wrong choice!");
        }

        // Close scanner
        scan.close();
    }
}
