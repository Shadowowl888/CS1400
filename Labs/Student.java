/*-------------------------------------------------------------
 * AUTHOR: Devin Khun
 * FILENAME: Student.java
 * SPECIFICATION: The Student class is used to create a new student object with the name, broncoID, and grade attributes. The class contains getter methods for all the attributes, a setGrade method to update the grade, and a toString method to return a formatted string with the student's information.
 * FOR: CS 1400 - Lab #5
 * TIME SPENT: 30 mins
//-------------------------------------------------------------*/

public class Student {
    private String firstName;
    private String lastName;
    private String fullName;
    private String broncoId;
    private double grade;

    /**
     * The Student constructor takes in the student's first name, last name, and BroncoID as paramters and assigns it to variables. The student's full name is concatenated from the first and last name. The initial grade is assigned a value of -1.
     * @param fname the student's first name
     * @param lname the student's last name
     * @param broncoId the student's BroncoID
     */
    public Student(String fname, String lname, String broncoId) {
        firstName = fname;
        lastName = lname;
        this.broncoId = broncoId;
        fullName = firstName + " " + lastName;
        grade = -1;
    }

    /**
     * The getFirstName method returns the student's first name.
     * @return the student's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * The getLastName method returns the student's last name.
     * @return the student's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * The getFullName method returns the student's full name.
     * @return the student's full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * The getBroncoId method returns the student's BroncoID.
     * @return the student's BroncoID
     */
    public String getBroncoId() {
        return broncoId;
    }

    /**
     * The getGrade method returns the student's current grade.
     * @return the student's current grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * The setGrade method updates the student's grade with the inputted grade.
     * @param newGrade the grade value to assign to the student's grade
     */
    public void setGrade(double newGrade) {
        grade = newGrade;
    }

    /**
     * The toString method returns a string with the format of the student's name, BroncoID, and grade.
     * @return string format of the student's name, BroncoID, and grade
     */
    public String toString() {
        return String.format("Student: %s, Bronco ID: %s, Grade: %s", fullName, broncoId, grade);
    }
}
