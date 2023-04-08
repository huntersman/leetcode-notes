import java.util.ArrayList;
import java.util.List;

public class Combinations {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(1, new ArrayList<>(), n, k);
        return ans;
    }

    public void backtracking(int index, List<Integer> list, int n, int k) {
        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <= n && list.size() + n - index >= k - 1; i++) {
            list.add(i);
            backtracking(i + 1, list, n, k);
            list.remove(list.size() - 1);
        }
    }
}
