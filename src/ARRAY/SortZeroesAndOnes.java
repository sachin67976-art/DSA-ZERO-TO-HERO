package ARRAY;

import java.util.Scanner;

public class SortZeroesAndOnes {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortZeroesAndOnes(int[] arr) {
        int n = arr.length;
        int zeroes = 0;

        // Count zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        // Fill array
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter 0s and 1s:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortZeroesAndOnes(arr);

        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }
}