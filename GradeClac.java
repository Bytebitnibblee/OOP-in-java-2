package exception;
import java.util.Scanner;

public class GradeClac {


	public class GradeCalculator {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Input student name and marks
	        System.out.print("Enter student's name: ");
	        String name = input.nextLine();

	        System.out.print("Enter marks for Subject 1: ");
	        int sub1 = input.nextInt();

	        System.out.print("Enter marks for Subject 2: ");
	        int sub2 = input.nextInt();

	        System.out.print("Enter marks for Subject 3: ");
	        int sub3 = input.nextInt();

	        // Calculate total and average
	        int total = sub1 + sub2 + sub3;
	        double average = total / 3.0;

	        // Determine grade
	        String grade;
	        if (average >= 80) {
	            grade = "A";
	        } else if (average >= 60) {
	            grade = "B";
	        } else if (average >= 40) {
	            grade = "C";
	        } else {
	            grade = "F";
	        }

	        // Output result
	        System.out.println("\n--- Result ---");
	        System.out.println("Name: " + name);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average: " + average);
	        System.out.println("Grade: " + grade);
	        
	        input.close();
	    }
	}
}


