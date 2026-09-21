import java.util.Scanner;

public class Findprefixsummatrix {

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

    // Create 2D Prefix Sum Matrix
    static void findprefixsummatrix(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        // Row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // Column-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    // Rectangle Sum using 2D Prefix Sum: O(1)
    static int findsum3(int[][] matrix, int l1, int r1, int l2, int r2) {

        // Convert matrix into prefix sum matrix
        findprefixsummatrix(matrix);

        int sum = matrix[l2][r2];

        int up = 0;
        int left = 0;
        int leftup = 0;

        // Remove area above the rectangle
        if (l1 > 0) {
            up = matrix[l1 - 1][r2];
        }

        // Remove area to the left of the rectangle
        if (r1 > 0) {
            left = matrix[l2][r1 - 1];
        }

        // Add back overlapping area
        if (l1 > 0 && r1 > 0) {
            leftup = matrix[l1 - 1][r1 - 1];
        }

        return sum - up - left + leftup;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter " + (r * c) + " values:");

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

        // Normal method
        System.out.println("Rectangle sum using normal method: "
                + findsum(matrix, l1, r1, l2, r2));

        // Prefix sum method
        System.out.println("Rectangle sum using prefix sum: "
                + findsum3(matrix, l1, r1, l2, r2));

        sc.close();
    }
}