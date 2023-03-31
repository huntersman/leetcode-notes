// https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            // find start
            int mid = right - (right - left) / 2;
            if (nums[mid] == target) {
                start = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            // find end
            int mid = right - (right - left) / 2;
            if (nums[mid] == target) {
                end = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{start, end};
    }
}
