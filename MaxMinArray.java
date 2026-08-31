import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user for the size of the array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Read elements into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize max and min with the first element
        int max = arr[0];
        int min = arr[0];

        // Find max and min
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        scanner.close();
    }
}
