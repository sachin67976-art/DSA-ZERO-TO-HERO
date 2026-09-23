package ARRAY;

import java.util.Scanner;

public class Printsprial {

    static void printmatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    static void printspiralorder(int[][] matrix, int r, int c) {

        int topRow = 0;
        int bottomRow = r - 1;
        int leftcol = 0;
        int rightcol = c - 1;

        int totalelemets = 0;

        while (totalelemets < r * c) {

            // Top row -> left to right
            for (int j = leftcol;
                 j <= rightcol && totalelemets < r * c;
                 j++) {

                System.out.print(matrix[topRow][j] + " ");
                totalelemets++;
            }

            topRow++;

            // Right column -> top to bottom
            for (int i = topRow;
                 i <= bottomRow && totalelemets < r * c;
                 i++) {

                System.out.print(matrix[i][rightcol] + " ");
                totalelemets++;
            }

            rightcol--;

            // Bottom row -> right to left
            for (int j = rightcol;
                 j >= leftcol && totalelemets < r * c;
                 j--) {

                System.out.print(matrix[bottomRow][j] + " ");
                totalelemets++;
            }

            bottomRow--;

            // Left column -> bottom to top
            for (int i = bottomRow;
                 i >= topRow && totalelemets < r * c;
                 i--) {

                System.out.print(matrix[i][leftcol] + " ");
                totalelemets++;
            }

            leftcol++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        int total = r * c;

        System.out.println("Enter " + total + " values:");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix:");
        printmatrix(matrix);

        System.out.println("Spiral Order:");
        printspiralorder(matrix, r, c);

        sc.close();
    }
}