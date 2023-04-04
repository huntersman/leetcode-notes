public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int tmp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow++] = tmp;
            }
            fast++;
        }
    }
}
