import java.util.Scanner;

public class Matrixmultiply {

    // Matrix print karne ka method
    static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Matrix multiplication ka method
    static void multiply(int[][] a, int r1, int c1,
                         int[][] b, int r2, int c2) {

        // Multiplication tabhi possible hai jab c1 == r2
        if (c1 != r2) {
            System.out.println("Multiplication not possible - wrong dimensions");
            return;
        }

        // Result matrix
        int[][] mul = new int[r1][c2];

        // Multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Result print
        System.out.println("Multiplication of Matrix 1 and Matrix 2:");
        printmatrix(mul);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matrix 1
        System.out.println("Enter number of rows of Matrix 1:");
        int r1 = sc.nextInt();

        System.out.println("Enter number of columns of Matrix 1:");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter Matrix 1 values:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Matrix 2
        System.out.println("Enter number of rows of Matrix 2:");
        int r2 = sc.nextInt();

        System.out.println("Enter number of columns of Matrix 2:");
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter Matrix 2 values:");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Print Matrix 1
        System.out.println("Matrix 1:");
        printmatrix(a);

        // Print Matrix 2
        System.out.println("Matrix 2:");
        printmatrix(b);

        // Multiply matrices
        multiply(a, r1, c1, b, r2, c2);

        sc.close();
    }
}
//OUTPUT