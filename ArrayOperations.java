import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        // Accept 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        // Initialize variables
        int largest = arr[0];
        int smallest = arr[0];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        // Process array
        for (int num : arr) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
            sum += num;
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        double average = (double) sum / arr.length;
        // Output results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of elements: " + average);
        System.out.println("Number of Even elements: " + evenCount);
        System.out.println("Number of Odd elements: " + oddCount);
    }
}

