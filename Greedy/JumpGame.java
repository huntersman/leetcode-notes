public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= maxPosition) {
                maxPosition = Math.max(maxPosition, nums[i] + i);
            }
        }
        return maxPosition >= nums.length - 1;
    }
}
