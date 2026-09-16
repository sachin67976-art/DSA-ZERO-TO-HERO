import java.util.Scanner;

public class Matrixsum {

    static void printmatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();
        }
    }

    static void add(int[][] a, int r1, int c1,
                    int[][] b, int r2, int c2) {

        if (r1 != r2 || c1 != c2) {

            System.out.println("Wrong input - addition not possible");
            return;
        }

        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c1; j++) {

                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of Matrix:");
        printmatrix(sum);
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

        // Print matrices
        System.out.println("Matrix 1:");
        printmatrix(a);

        System.out.println("Matrix 2:");
        printmatrix(b);

        // Add matrices a
        add(a, r1, c1, b, r2, c2);
    }
}