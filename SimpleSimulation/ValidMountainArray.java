public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int left = 0, right = arr.length - 1;
        while (left + 1 < arr.length && arr[left + 1] > arr[left]) {
            left++;
        }
        while (right - 1 >= 0 && arr[right] < arr[right - 1]) {
            right--;
        }
        if (left == right && left != 0 && right != arr.length - 1) {
            return true;
        }
        return false;
    }
}
