import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        backtracking(new ArrayList<>(), nums, 0, visited);
        return ans;
    }

    public void backtracking(List<Integer> list, int[] nums, int index, boolean[] visited) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1]) {
                continue;
            }
            if (!visited[i]) {
                list.add(nums[i]);
                visited[i] = true;
                backtracking(list, nums, i, visited);
                visited[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
