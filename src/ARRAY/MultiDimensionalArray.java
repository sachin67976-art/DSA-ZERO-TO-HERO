package ARRAY;

public class MultiDimensionalArray {

    static void printarray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) { // row

            for (int j = 0; j < arr[i].length; j++) { // column
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {


        int[][] arr2 = {
                {1, 5, 6},
                {7, 9, 11},
                {8, 1, 1}
        };

        printarray(arr2);
    }
}
