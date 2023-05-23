public class MergeTwoBinaryTrees {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return preOrder(root1, root2);
    }

    public TreeNode preOrder(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null) {
            root1 = new TreeNode(0, null, null);
        }
        if (root2 == null) {
            root2 = new TreeNode(0, null, null);
        }
        TreeNode node = new TreeNode(root1.val + root2.val);
        node.left = preOrder(root1.left, root2.left);
        node.right = preOrder(root1.right, root2.right);
        return node;
    }
}
