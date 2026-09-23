package ARRAY;

import java.util.Scanner;

public class Generatespiral {

    // Matrix print karne ka method
    static void printmatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Spiral matrix generate karne ka method
    static int[][] Generatespiralmatrix(int n) {

        int[][] matrix = new int[n][n];

        int topRow = 0;
        int bottomRow = n - 1;
        int leftcol = 0;
        int rightcol = n - 1;

        int curr = 1;

        while (curr <= n * n) {

            // Top row -> left to right
            for (int j = leftcol;
                 j <= rightcol && curr <= n * n;
                 j++) {

                matrix[topRow][j] = curr++;
            }

            topRow++;

            // Right column -> top to bottom
            for (int i = topRow;
                 i <= bottomRow && curr <= n * n;
                 i++) {

                matrix[i][rightcol] = curr++;
            }

            rightcol--;

            // Bottom row -> right to left
            for (int j = rightcol;
                 j >= leftcol && curr <= n * n;
                 j--) {

                matrix[bottomRow][j] = curr++;
            }

            bottomRow--;

            // Left column -> bottom to top
            for (int i = bottomRow;
                 i >= topRow && curr <= n * n;
                 i--) {

                matrix[i][leftcol] = curr++;
            }

            leftcol++;
        }

        return matrix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int[][] matrix = Generatespiralmatrix(n);

        System.out.println("Spiral Matrix:");

        printmatrix(matrix);

        sc.close();
    }
}