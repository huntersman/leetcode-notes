public class CountCompleteTreeNodes {
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

    int cnt;

    public int countNodes(TreeNode root) {
        preOrder(root);
        return cnt;
    }

    private void preOrder(TreeNode root) {
        if (root != null) {
            cnt++;
            countNodes(root.left);
            countNodes(root.right);
        }
    }
}
