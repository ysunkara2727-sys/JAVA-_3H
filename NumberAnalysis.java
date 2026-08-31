import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        // 1. Determine if the number is Positive, Negative, or Zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        // 2. Determine if the number is Odd or Even
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        // 3. Determine if it is divisible by 5
        if (number % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else {
            System.out.println("The number is not divisible by 5.");
        }
        // Close the scanner resource
        scanner.close();
    }
}