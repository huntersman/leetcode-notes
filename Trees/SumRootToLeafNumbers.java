public class SumRootToLeafNumbers {
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
    StringBuilder sb = new StringBuilder();

    public int sumNumbers(TreeNode root) {
        inOrder(root);
        return sum;
    }

    private void inOrder(TreeNode node) {
        if (node != null) {
            sb.append(node.val);
            inOrder(node.left);
            if (node.left == null && node.right == null) {
                sum += Integer.parseInt(String.valueOf(sb));
            }
            inOrder(node.right);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
