/*-------------------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Lab9.java
// SPECIFICATION: This program prompts the user by asking if they want to check whether a word/sentence is a palindrome. If the user responds with "yes" then it will check whether the typed word is a palindrome using the isPalindrome method. If the user responds with "no" then the program will end.
// FOR: CS1400 - Lab #9
// TIME SPENT: 30 minutes
//----------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab9 {
	
	public static void main(String[] args) {
		
	      //declaring variables
	      String choice, str;
	      char command;

	      Scanner keyboard = new Scanner(System.in);
	      
	      do
	       {
	    	  
	           // ask a user a word/sentence or q to quit
	           System.out.println("Do you want to check if a word/sentence is a palindrome (yes/no)?");
	           choice = keyboard.next().toLowerCase();
	           command = choice.charAt(0);
	           
	           switch (command)
	            {
	                 case 'y': // tests whether a word/sentence is a palindrome
	                      // consuming the empty string
	                      keyboard.nextLine();
	                	 
	                      System.out.println("\nPlease enter a word/sentence:");
	                      str = keyboard.nextLine();
	                      if(Palindrome.isPalindrome(str))
				 System.out.println(str + " is a palindrome\n");
			      else
				 System.out.println(str + " is not a palindrome\n");
	                      break;

	                 case 'n': // quit

                	      System.out.println("Bye!");
	                      break;
	                 default:
	                      System.out.println("Invalid input!");
	            }

	        } while (command != 'n');
	      
	      keyboard.close();
		
	} //end of the main method

} //end of the class
