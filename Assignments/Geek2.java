/*-------------------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Geek2.java
// SPECIFICATION: This program contains find, digitSum, pow, smallestDigit, and reverse methods to be used in the main driver program.
// FOR: CS 1400 - ASSIGNMENT #8
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

public class Geek2 {
    /**
     * The find method searches for the match string in the other string provided to the parameter. 
     * @param str the string to search in
     * @param match the string to search for
     * @return true if the match string is in str and false if it is not found
     */
    public static boolean find(String str, String match) {
        if (str.length() == 0 || match.length() == 0 || match.length() > str.length()) {
            return false;
        }
        if (str.startsWith(match)) {    
            return true;
        } else {
            return find(str.substring(1), match);
        }
    }

    /**
     * The digitSum method adds all of the digits in the integer provided to the parameter.
     * @param n the integer to sum the digits of
     * @return the sum of the digits of the integer
     */
    public static int digitSum(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + digitSum(n / 10);
        }
    }

    /**
     * The pow method returns the exponential power of the integer provided to the parameter.
     * @param a the base integer to apply the exponent to
     * @param n the exponential power
     * @return the integer raised to the n power
     */
    public static int pow(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            return a * pow(a, n-1);
        }
    }

    /**
     * The smallestDigit method returns the smallest digit of the number provided to the parameter.
     * @param number the number to search through
     * @return the smallest digit in the number
     */
    public static int smallestDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            int firstDigit = number % 10;
            int rest = number / 10;
            int smallestInRest = smallestDigit(rest);
            return Math.min(firstDigit, smallestInRest);

            // String numStr = String.valueOf(number);
            // String firstDigit = numStr.substring(0, 1);
            // numStr = numStr.substring(1);
            // int num = Integer.valueOf(numStr);
            // int firstNum = Integer.valueOf(firstDigit);
            // int minRest = smallestDigit(num);
            // return Math.min(firstNum, minRest);
        }
    }

    /**
     * The reverse method reverses the text string provided to the parameter.
     * @param text the string to be reversed
     * @return the reversed string of text
     */
    public static String reverse(String text) {
        if (text.length() <= 1) {
            return text;
        } else {
            char firstChar = text.charAt(0);
            String reversedText = reverse(text.substring(1));
            return reversedText + firstChar;
        }
    }
}