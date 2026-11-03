public class Leedcode30 {

    public static int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // Place each number at its correct index
        for (int i = 0; i < n; i++) {

            while (nums[i] >= 1 &&
                    nums[i] <= n &&
                    nums[nums[i] - 1] != nums[i]) {

                int index = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }

        // Find the first missing positive number
        for (int i = 0; i < n; i++) {

            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, -1, 1};

        int result = firstMissingPositive(nums);

        System.out.println("Smallest Missing Positive: " + result);
    }
}