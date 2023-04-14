/*-------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Collection.java
// SPECIFICATION: The Collection class contains methods of different array operations to be used in the driver program. These methods include adding a number, removing a number, searching for a number, doubing the array size, computing the average, and a toString method.
// FOR: CS 1400 - ASSIGNMENT #6
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/

public class Collection {
    private int[] numArray;
    private int count;

    /**
     * The Collection constructor creates a new integer array with the specified array size and sets the number of integers to zero.
     * @param arraySize the size of the array to create
     */
    public Collection(int arraySize) {
        numArray = new int[arraySize];
        count = 0;
    }

    /**
     * The Search method returns the index of the number specified by the parameter in the array. If the number is not found, it returns -1.
     * @param searchingNum the number to look for in the array
     * @return the index of the number or -1 if the number is not found
     */
    private int search(int searchingNum) {
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == searchingNum) {
                return i;
            }
        }
        return -1;
    }

    /**
     * The Add method checks if the number specified exists in the array and has not exceeded its capacity, then it adds the number at the smallest available index. If the array has reached its capacity, its size will be doubled and the number will be added.
     * @param numberToAdd the number to add to the array
     * @return True if the number was added to the array and False if the number was not added to the array
     */
    public boolean add(int numberToAdd) {
        int index = search(numberToAdd);
        if (index == -1 && count < numArray.length) {
            numArray[count] = numberToAdd;
            count++;
            return true;
        } else if (index == -1 && count >= numArray.length) {
            doubleArray();
            numArray[count] = numberToAdd;
            count++;
            return true;
        }
        return false;
    }

    /**
     * The Remove method checks if the number specified is in the array and if it is, it removes the number from the array and shifts the integers after it down.
     * @param numberToRemove the number to remove from the array
     * @return True if the number was removed from the array and False if the number was not removed from the array
     */
    public boolean remove(int numberToRemove) {
        int index = search(numberToRemove);
        if (index != -1) {
            for (int i = index; i < numArray.length-1; i++) {
                numArray[i] = numArray[i+1];
            }
            count--;
            return true;
        }
        return false;
    }

    /**
     * The doubleArray method doubles the size of the array.
     */
    private void doubleArray() {
        int[] newArray = new int[numArray.length * 2];
        for (int i = 0; i < newArray.length; i++) {
            if (i < count) {
                newArray[i] = numArray[i];
            } else {
                newArray[i] = 0;
            }
        }
        numArray = newArray;
    }

    /**
     * The findLargest method finds the largest number in the array.
     * @return the largest number in the array
     */
    public int findLargest() {
        int max = numArray[0];
        for (int x : numArray) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    /**
     * The computeAvg method calculates the average of the numbers in the array.
     * @return the average of the numbers in the array
     */
    public double computeAvg() {
        double sum = 0;
        for (int x : numArray) {
            sum += x;
        }
        return sum / count;
    }

    /**
     * The countPositives method counts the number of positive integers in the array.
     * @return the number of positive integers in the array
     */
    public int countPositives() {
        int positiveCount = 0;
        for (int x : numArray) {
            if (x > 0) {
                positiveCount++;
            }
        }
        return positiveCount;
    }

    /**
     * The toString method produces a string of the current numbers in the array separated by a comma.
     * @return a string containing a list of numbers stored in the array with curly brackets
     */
    public String toString() {
        String str = "{";
        for (int i = 0; i < count; i++) {
            if (i == count-1) {
                str += numArray[i] + "";
            } else {
                str += numArray[i] + ", ";
            }
        }
        str += "}";
        return str;
    }
}
