package ARRAY;

import java.util.Scanner;

public class Rangequery {

    // Prefix Sum Array banane ka method
    static int[] makePrefixSumArray(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array size
        System.out.print("Enter array size = ");
        int n = sc.nextInt();

        // Array create
        int[] arr = new int[n];

        // Array input
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Prefix sum array
        int[] prefsum = makePrefixSumArray(arr);

        // Number of queries
        System.out.print("Enter number of queries = ");
        int q = sc.nextInt();

        // Queries
        while (q-- > 0) {

            System.out.print("Enter range (l r) = ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans;

            // l aur r 1-based indexing mein hain
            if (l == 1) {
                ans = prefsum[r - 1];
            } else {
                ans = prefsum[r - 1] - prefsum[l - 2];
            }

            System.out.println("Sum = " + ans);
        }

        sc.close();
    }
}