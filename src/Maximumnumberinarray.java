public class Maximumnumberinarray {
    static int findmaxinumber(int arr []) {
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;

    }
    static void main(String[] args) {
        int arr[]={1,2,90,4,5,6,};
        System.out.println(findmaxinumber(arr));

    }
}
