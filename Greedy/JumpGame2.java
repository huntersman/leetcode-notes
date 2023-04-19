public class JumpGame2 {
    public int jump(int[] nums) {
        int cnt = 1;
        int maxPosition = nums[0];
        if (nums.length == 1) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= maxPosition) {
                max = Math.max(max, nums[i] + i);
            }
            if (i == maxPosition) {
                cnt++;
                maxPosition = max;
            }
            if (maxPosition >= nums.length - 1) {
                return cnt;
            }
        }
        return cnt;
    }
}
