package ARRAY;

public class Practicesheet {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 6, 5};
        int sum = 0;

        for (int i = 3; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}