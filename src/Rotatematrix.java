import java.util.Scanner;

public class Rotatematrix {

    // Matrix print karne ka method
    static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Transpose matrix
    static void transposeinplace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Array ko reverse karna
    static void reversearray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    // Matrix ko 90 degree clockwise rotate karna
    static void rotate(int[][] matrix, int n) {

        // Step 1: Transpose
        transposeinplace(matrix, n, n);

        // Step 2: Har row ko reverse
        for (int i = 0; i < n; i++) {
            reversearray(matrix[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns of matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Rotation using transpose + reverse works for square matrix
        if (r != c) {
            System.out.println("Rotation is possible only for a square matrix.");
            return;
        }

        int[][] matrix = new int[r][c];

        System.out.println("Enter " + (r * c) + " values:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix:");
        printmatrix(matrix);

        rotate(matrix, r);

        System.out.println("Rotated Matrix (90 Degree Clockwise):");
        printmatrix(matrix);

        sc.close();
    }
}