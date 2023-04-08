import java.util.ArrayList;
import java.util.List;

public class Combinations3 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(0, new ArrayList<>(), 1, k, n);
        return ans;
    }

    public void backtracking(int sum, List<Integer> list, int index, int k, int n) {
        if (sum == n && list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <= 9 && list.size() + (9 - i) + 1 >= k; i++) {
            sum += i;
            list.add(i);
            backtracking(sum, list, i + 1, k, n);
            list.remove(list.size() - 1);
            sum -= i;
        }
    }
}
