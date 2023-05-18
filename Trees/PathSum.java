public class PathSum {

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

    boolean exists = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        preOrder(root, targetSum, 0);
        return exists;
    }

    private void preOrder(TreeNode node, int target, int sum) {
        if (node != null) {
            sum += node.val;
            if (sum == target && node.left == null && node.right == null) {
                exists = true;
            }
            preOrder(node.left, target, sum);
            preOrder(node.right, target, sum);
        }
    }
}
