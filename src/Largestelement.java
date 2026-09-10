public class Largestelement {
    static int largestElement(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};

        System.out.println(largestElement(nums));
    }
}