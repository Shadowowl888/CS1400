/*-------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Lab5.java
// SPECIFICATION: This program simulates an autograder application in Java and uses the Student and Program classes. It asks the user for information about the student and the program file. It then uses the information to create new student and program objects prints the program submission details.
// FOR: CS 1400 - Lab #5
// TIME SPENT: 30 mins
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sFirstname, sLastname, sBroncoId;
        double sGrade;
        String pName, pDesc, pFname;
        
        // Read some input data
        System.out.println("The student's first name?"); 
        sFirstname = scan.nextLine();
        System.out.println("The student's last name?"); 
        sLastname = scan.nextLine();
        System.out.println("The student's Bronco Id?"); 
        sBroncoId = scan.nextLine();
        System.out.println("Program name?"); 
        pName = scan.nextLine();
        System.out.println("Program desc?"); 
        pDesc = scan.nextLine();
        System.out.println("Program filename?"); 
        pFname = scan.nextLine();
        System.out.println("Program grade?"); 
        sGrade = scan.nextDouble(); 
        scan.nextLine();
        System.out.println(""); 
        scan.close();
        
        
        // Create a Student object "student1"
        // -->
        Student student1 = new Student(sFirstname, sLastname, sBroncoId);
        System.out.println("Making a student record\n...[" + student1 + "]");
        
        // Use the setGrade setter to set student1's grade
        // -->
        student1.setGrade(sGrade);
        
        // Create a Program object "program1" by "student1"
        // -->
        Program program1 = new Program(pName, pDesc, pFname, student1);
        System.out.println("Making a program record\n...[" + program1 + "]");
        
        // Produce a report with the information below by using a helper method. The specification is provided in the UML class diagram
        makeReport(program1);
    }

    /**
     * The makeReport method takes in a Program object as a parameter and prints the submission details for that program.
     * @param program the program object to print the submission details for
     */
    public static void makeReport(Program program) {
        System.out.println("\n========== Program Submission Detail ==========");
        System.out.println(String.format("%-12s: %-10s", "Student", program.getAuthor().getFullName()));
        System.out.println(String.format("%-12s: %-10s", "Bronco ID", program.getAuthor().getBroncoId()));
        System.out.println(String.format("%-12s: %-10s", "Grade", "" + program.getAuthor().getGrade()));
        System.out.println("");
        System.out.println(String.format("%-12s: %-10s", "Program", program.getProgramName()));
        System.out.println(String.format("%-12s: %-10s", "Filename", program.getFileName()));
        System.out.println(String.format("%-12s: %-10s", "Description", program.getDescription()));
        System.out.println(String.format("%-12s: %-10s", "Datetime", program.getCreatedDate()));
    }
}