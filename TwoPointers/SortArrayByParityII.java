public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int odd = 1, even = 0;
        while (odd < nums.length && even < nums.length) {
            if (nums[odd] % 2 == 1 && nums[even] % 2 == 0) {
                odd += 2;
                even += 2;
            } else if (nums[odd] % 2 == 0 && nums[even] % 2 == 1) {
                int tmp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = tmp;
                even += 2;
                odd += 2;
            } else if (nums[odd] % 2 == 1) {
                odd += 2;
            } else if (nums[even] % 2 == 0) {
                even += 2;
            }
        }
        return nums;
    }
}
