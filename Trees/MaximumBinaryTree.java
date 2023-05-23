public class MaximumBinaryTree {
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

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return findNode(nums, 0, nums.length);
    }

    public TreeNode findNode(int[] nums, int left, int right) {
        if (left >= right) {
            return null;
        }
        int maxPos = left;
        int max = nums[maxPos];
        for (int i = left; i < right; i++) {
            if (nums[i] > max) {
                maxPos = i;
                max = nums[i];
            }
        }
        TreeNode node = new TreeNode(nums[maxPos]);
        node.left = findNode(nums, left, maxPos);
        node.right = findNode(nums, maxPos + 1, right);
        return node;
    }
}
