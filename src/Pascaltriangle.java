
import java.util.Scanner;

public class Pascaltriangle {

    // Matrix print karne ka method
    static void printmatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Pascal Triangle banane ka method
    static int[][] pascal(int n) {

        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {

            // ith row has i+1 columns

            ans[i] = new int[i + 1];

            // First and last element = 1
            ans[i][0] = 1;
            ans[i][i] = 1;

            // Middle elements
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] ans = pascal(n);

        System.out.println("Pascal Triangle:");
        printmatrix(ans);

        sc.close();
    }
}
