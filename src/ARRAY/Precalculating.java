package ARRAY;

import java.util.Scanner;

public class Precalculating {

    // Normal method: O(rows * columns)
    static int findsum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    // Calculate row-wise prefix sum
    static void findprefixsummatrix(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        // Row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    // Using prefix sum: O(rows)
    static int findsum2(int[][] matrix, int l1, int r1, int l2, int r2) {

        int sum = 0;

        // Create row-wise prefix sum
        findprefixsummatrix(matrix);

        for (int i = l1; i <= l2; i++) {

            // If r1 is 0, there is no previous element
            if (r1 == 0) {
                sum += matrix[i][r2];
            } else {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1, r1, l2, r2:");

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum using normal method: "
                + findsum(matrix, l1, r1, l2, r2));

        System.out.println("Rectangle sum using prefix sum: "
                + findsum2(matrix, l1, r1, l2, r2));

        sc.close();
    }
}