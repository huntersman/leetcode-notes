public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int current = 0;
        int left = 0, right = 0;
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < target) {
            return 0;
        }
        for (; right < nums.length; right++) {
            current += nums[right];
            while (current >= target) {
                ans = Math.min(ans, right - left + 1);
                current -= nums[left++];
            }
        }
        return ans;
    }
}
