public class Maximumvalue {
    public static void main() {


        int[] arr = {1, 2, 3, 45};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
            System.out.println("max" + ans);
        }
    }
}
