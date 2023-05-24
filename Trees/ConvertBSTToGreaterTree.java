public class ConvertBSTToGreaterTree {
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

    int sum;

    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        reverseInorder(root);
        return root;
    }

    private void reverseInorder(TreeNode node) {
        if (node != null) {
            reverseInorder(node.right);
            sum += node.val;
            node.val = sum;
            reverseInorder(node.left);
        }
    }
}
