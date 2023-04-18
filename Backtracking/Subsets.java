import java.util.ArrayList;
import java.util.List;

public class Subsets {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtracking(new ArrayList<>(), nums, 0);
        return ans;
    }

    public void backtracking(List<Integer> list, int[] nums, int index) {
        ans.add(new ArrayList<>(list));
        if (index == nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
