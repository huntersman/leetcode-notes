import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(0, new ArrayList<>(), candidates, 0, target);
        return ans;
    }

    public void backtracking(int sum, List<Integer> list, int[] candidates, int index, int target) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                return;
            }
            sum += candidates[i];
            list.add(candidates[i]);
            backtracking(sum, list, candidates, i + 1, target);
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
