import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(0, new ArrayList<>(), target, 0, candidates);
        return ans;
    }

    public void backtracking(int sum, List<Integer> list, int target, int index, int[] candidates) {
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            sum += candidates[i];
            list.add(candidates[i]);
            backtracking(sum, list, target, i, candidates);
            list.remove(list.size() - 1);
            sum -= candidates[i];
        }
    }
}
