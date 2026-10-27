public class Practiceshhetinarray {
    static boolean findarray(int arr[], int target) {
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }


        return false;
    }


    static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        boolean ans = findarray(arr, 91);
        System.out.println(ans);

    }
}















