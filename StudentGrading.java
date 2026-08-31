import java.util.Scanner;
public class StudentGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array to store marks of 5 subjects
        double[] marks = new double[5];
        double totalMarks = 0;  
        // Accept marks from the user
        System.out.println("Enter the marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }
        // Calculate percentage (assuming each subject is out of 100)
        double percentage = (totalMarks / 500) * 100; 
        // Determine the grade accordingly
        char grade;
        if (percentage >= 75 && percentage <= 89) {
            grade = 'B';
        } else if (percentage >= 60 && percentage <= 74) {
            grade = 'C';
        } else if (percentage >= 40 && percentage <= 59) {
            grade = 'D';
        } else if (percentage < 40) {
            grade = 'F'; // Below 40 -> Fail
        } else {
            grade = 'A'; // For percentages 90 and above
        }
        // Display calculations
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);  
        scanner.close();
    }
}