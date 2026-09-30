import java.util.*;

public class Leedcode {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        findCombination(candidates, target, 0,
                new ArrayList<>(), ans);

        return ans;
    }

    static void findCombination(
            int[] candidates,
            int target,
            int index,
            List<Integer> current,
            List<List<Integer>> ans) {

        // Target 0 ho gaya
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Target negative ho gaya
        if (target < 0) {
            return;
        }

        // Candidates ko try karo
        for (int i = index; i < candidates.length; i++) {

            current.add(candidates[i]);

            // Same number ko dobara use kar sakte hain
            findCombination(
                    candidates,
                    target - candidates[i],
                    i,
                    current,
                    ans
            );

            // Backtracking
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result =
                combinationSum(candidates, target);

        System.out.println(result);
    }
}