import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    Deque<Integer> deque = new ArrayDeque<>();

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int left = 0, right = 0;
        for (int i = 0; i < k - 1; i++) {
            extracted(nums, i);
        }
        for (left = 0, right = k - 1; right < nums.length; right++, left++) {
            extracted(nums, right);
            ans[left] = deque.getFirst();
            if (nums[left] == deque.getFirst()) {
                deque.removeFirst();
            }
        }
        return ans;
    }

    private void extracted(int[] nums, int right) {
        if (deque.isEmpty()) {
            deque.add(nums[right]);
        } else {
            while (!deque.isEmpty() && nums[right] > deque.getLast()) {
                deque.removeLast();
            }
            deque.add(nums[right]);
        }
    }
}
