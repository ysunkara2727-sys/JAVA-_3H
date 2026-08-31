import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        // Create a Scanner object to accept input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalStr = scanner.nextLine();

        // 1. Print the original String
        System.out.println("\n1. Original String: " + originalStr);

        // 2. Reverse the String using a loop
        String reversedStr = "";

        for (int i = originalStr.length() - 1; i >= 0; i--) {
            reversedStr += originalStr.charAt(i);
        }

        System.out.println("2. Reversed String: " + reversedStr);

        // 3. Check if the String is a Palindrome
        // Case-insensitive check
        if (originalStr.equalsIgnoreCase(reversedStr)) {
            System.out.println("3. Result: The string is a Palindrome.");
        } else {
            System.out.println("3. Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}