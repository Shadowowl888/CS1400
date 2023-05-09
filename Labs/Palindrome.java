/*-------------------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Palindrome.java
// SPECIFICATION: The Palindrome class contains a static boolean method to see whether the given word is a palindrome. It returns true if the word is a palindrome and false otherwise.
// FOR: CS1400 - Lab #9
// TIME SPENT: 30 minutes
//----------------------------------------------------------------------*/

public class Palindrome {
	
   public static boolean isPalindrome(String text) {
	
	//checking the base case (hint: check the length of the text)
	//-->
    	if (text.length() <= 1) {
    	   return true; // It is a palindrome
        }
    	else	{
	   // Get first and last characters converted to lowercase.
    	   //-->
		   char first = text.toLowerCase().charAt(0);
		   char last = text.toLowerCase().charAt(text.length()-1);
 	   // Check if first and last characters are letters (not punctuation marks or spaces)
     	   //-->	    		
	   if (first >= 'a' && first <= 'z' && last >= 'a' && last <= 'z')	{
              // If both are equal, remove them and return the output of another isPalindrome method call that is passed the remainder of the text.
	      //-->
	      if (first == last) {	
        	 //-->  
			 return isPalindrome(text.substring(1,text.length()-1));
	      } else {
		 return false; // It is not a palindrome
	      }
	   }
	   // Test if the last character is not a letter.
	   //-->
	   else if (last <= 'z' || last >= 'z')	{
		// Remove the last character and return the output of another isPalindrome method call that is passed the remainder of the text.
		//-->
		return isPalindrome(text.substring(0,text.length()-1));
	   }
	   // In this case, the first character is not a letter.		
	   else {
		// Remove the first character and return the output of another isPalindrome method call that is passed the remainder of the text.
		//-->
		return isPalindrome(text.substring(1,text.length()-1));
	   }
        }

   }

}