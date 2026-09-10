import java.util.Scanner;
import java.util.Arrays;

public class Decresingorder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter sorted array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {

            if (Math.abs(a[left]) > Math.abs(a[right])) {
                ans[i] = a[left] * a[left];
                left++;
            } else {
                ans[i] = a[right] * a[right];
                right--;
            }
        }

        System.out.println("Squared array: " + Arrays.toString(ans));
    }
}