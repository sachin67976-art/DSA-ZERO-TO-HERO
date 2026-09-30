import java.util.*;

class Leedcode39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        findCombination(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    static void findCombination(
            int[] candidates,
            int target,
            int index,
            List<Integer> current,
            List<List<Integer>> ans) {

        // Target complete ho gaya
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Target se bada ho gaya
        if (target < 0) {
            return;
        }

        // Har possible number try karo
        for (int i = index; i < candidates.length; i++) {

            // Number choose karo
            current.add(candidates[i]);

            // Same number dobara use kar sakte hain
            findCombination(
                    candidates,
                    target - candidates[i],
                    i,
                    current,
                    ans
            );

            // Number remove karo
            current.remove(current.size() - 1);
        }
    }
}