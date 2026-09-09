import java.util.Arrays;
import java.util.Scanner;

public class SortEvenOdds {

    static int[] sortEvenOdd(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            while (i < j && arr[i] % 2 == 0) {
                i++;
            }

            while (i < j && arr[j] % 2 != 0) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // even or odd nubeer

        sortEvenOdd(arr);

        System.out.println("Updated Array:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}