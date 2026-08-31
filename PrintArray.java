import java.util.Scanner;
public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
        scanner.close();
    }
}
