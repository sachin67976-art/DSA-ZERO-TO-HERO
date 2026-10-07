class Leetcode3 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both arrays
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }

            k++;
        }

        // Remaining elements of nums1
        while (i < nums1.length) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        // Remaining elements of nums2
        while (j < nums2.length) {
            arr[k] = nums2[j];
            j++;
            k++;
        }

        int n = arr.length;

        // If length is odd
        if (n % 2 != 0) {
            return arr[n / 2];
        }

        // If length is even
        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double answer = findMedianSortedArrays(nums1, nums2);

        System.out.println("Median = " + answer);
    }
}