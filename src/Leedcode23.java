public class Leedcode23 {

    public static int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int i = 0;

        while (i < n) {

            int correctIndex = nums[i] - 1;

            if (nums[i] > 0 &&
                    nums[i] <= n &&
                    nums[i] != nums[correctIndex]) {

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;

            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {

            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, -1, 1};

        int answer = firstMissingPositive(nums);

        System.out.println("First Missing Positive: " + answer);
    }
}