public class InsertIntoABinarySearchTree {
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

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        inOrder(root, val);
        return root;
    }

    public void inOrder(TreeNode node, int val) {
        if (node != null) {
            if (node.val > val) {
                if (node.left == null) {
                    node.left = new TreeNode(val);
                } else {
                    inOrder(node.left, val);
                }
            } else {
                if (node.right == null) {
                    node.right = new TreeNode(val);
                } else {
                    inOrder(node.right, val);
                }
            }
        }
    }
}
