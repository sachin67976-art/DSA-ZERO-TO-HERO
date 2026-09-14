package ARRAY;

import java.util.Scanner;

public class Prefixsum {

    // Print array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Make Prefix Sum Array
    static int[] makerPrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];

        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        return pref;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input Array:");
        printArray(arr);

        int[] pref = makerPrefixSumArray(arr);

        System.out.println("Prefix Sum Array:");
        printArray(pref);

        sc.close();
    }
}