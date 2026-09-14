import java.util.Scanner;

public class Equalsumpartition {

    // Total sum find karne ke liye
    static int findArraySum(int[] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        return totalSum;
    }

    // Equal sum partition check karne ke liye
    static boolean equalSumPartitions(int[] arr) {

        int totalSum = findArraySum(arr);
        int prefixSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            prefixSum += arr[i];

            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal sum partition possible: "
                + equalSumPartitions(arr));

        sc.close();
    }
}