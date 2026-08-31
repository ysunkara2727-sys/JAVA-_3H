import java.util.Scanner;
public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows of first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter columns of first matrix: ");
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter rows of second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter columns of second matrix: ");
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] sum = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("\nMatrix Addition Result:");
            printMatrix(sum);
        } else {
            System.out.println("\nMatrix addition not possible (different dimensions).");
        }

        if (cols1 == rows2) {
            int[][] product = new int[rows1][cols2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("\nMatrix Multiplication Result:");
            printMatrix(product);
        } else {
            System.out.println("\nMatrix multiplication not possible (columns of first ≠ rows of second).");
        }

        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
