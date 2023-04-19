// 01背包
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value += nums[i];
        }
        if (value % 2 != 0) {
            return false;
        }
        int target = value / 2;
        int[] dp = new int[target + 1];
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[target] == target;
    }
}
