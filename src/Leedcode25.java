
class Leedcode25 {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each positive number at its correct index
        for (int i = 0; i < n; i++) {

            while (nums[i] > 0 &&
                    nums[i] <= n &&
                    nums[nums[i] - 1] != nums[i]) {

                int correctIndex = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
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
        Leedcode25 obj = new Leedcode25();

        int[] nums = {3, 4, -1, 1};

        int result = obj.firstMissingPositive(nums);

        System.out.println("First Missing Positive: " + result);
    }
}
