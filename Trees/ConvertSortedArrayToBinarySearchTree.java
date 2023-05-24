public class ConvertSortedArrayToBinarySearchTree {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return process(nums, 0, nums.length);
    }

    private TreeNode process(int[] nums, int left, int right) {
        if (left >= right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = process(nums, left, mid);
        root.right = process(nums, mid + 1, right);
        return root;
    }
}
