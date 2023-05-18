public class SumOfLeftLeaves {
    private class TreeNode {
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

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        preOrder(root);
        return sum;
    }

    private void preOrder(TreeNode root) {
        if (root != null) {
            if (root.left != null && root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
