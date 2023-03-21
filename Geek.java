/*-------------------------------------------------------------
 * AUTHOR: Devin Khun
 * FILENAME: Geek.java
 * SPECIFICATION: 
 * FOR: CS 1400 - ASSIGNMENT #5
 * TIME SPENT: 30 mins
//-------------------------------------------------------------*/

public class Geek {
    private String name;
    private int numQuestions;

    /**
     * The Geek constructor takes in a name and assigns it to a name variable of the Geek object.
     * @param name the name of the geek
     */
    public Geek(String name) {
        this.name = name;
    }

    /**
     * The getName method returns the name of the geek.
     */
    public String getName() {
        return name;
    }

    /**
     * The getNumberOfQuestions method returns the number of requests asked by the user.
     * @return numQuestions number of requests made by the user
     */
    public int getNumberOfQuestions() {
        return numQuestions;
    }

    /**
     * The isEven method determines if the inputted number is even or not.
     * @param num number to check if it is even
     * @return true if the number is even and false if it is odd
     */
    public boolean isEven(int num) {
        numQuestions++;

        return num % 2 == 0;
    }
    
    /**
     * The multiConcat method concantenates the inputted string the number of times the user specifies.
     * @param text string used to concantenate
     * @param count number of times to concantenate the string
     * @return the fully contenated text
     */
    public String multiConcat(String text, int count) {
        numQuestions++;

        if (count < 2) {
            return text;
        }

        String concat = "";
        for (int i = 0; i < count; i++) {
            concat += text;
        }
        return concat;
    }

    /**
     * The sumRange method sums up the numebers between two numbers (exclusive). If the two numbers are the same or the first number is larger than the second number, the result is 0.
     * @param num1 first number in the range
     * @param num2 second number in the range
     * @return the sum of the numbers between num1 and num2
     */
    public int sumRange(int num1, int num2) {
        numQuestions++;

        if (num1 == num2 || num1 > num2) {
            return 0;
        }

        int sum = 0;
        for (int i = num1+1; i < num2; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * The sorted method determines if a set of three numbers is inputted in numerical sorted order.
     * @param num1 first number in the set
     * @param num2 second number in the set
     * @param num3 third number in the set
     * @return true if the numbers go in increasing order and false otherwise
     */
    public boolean sorted(int num1, int num2, int num3) {
        numQuestions++;
        
        return ((num1 < num2) && (num2 < num3));
    }
    
    /**
     * The countA method counts the number of "A"s in a text. 
     * @param text the string used to count
     * @return the number of "A"s in the text string
     */
    public int countA(String text) {
        numQuestions++;

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    /**
     * The countDigits method counts the number of digits in a number.
     * @param num the number used to count the digits of
     * @return the number of digits in the number
     */
    public int countDigits(int num) {
        numQuestions++;

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    /**
     * The isPrime method determines whether a number is prime or not.
     * @param num the number to check if it is prime
     * @return true if the number is prime and false if it is not prime
     */
    public boolean isPrime(int num) {
        numQuestions++;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
