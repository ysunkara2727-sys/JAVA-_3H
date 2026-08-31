import java.util.Scanner;

public class MatrixReadPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][cols];

        // Read elements into the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }

        scanner.close();
    }
}
