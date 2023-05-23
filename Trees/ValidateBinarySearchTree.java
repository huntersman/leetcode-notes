import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
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

    List<Integer> list;

    public boolean isValidBST(TreeNode root) {
        list = new ArrayList<>();
        inOrder(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            list.add(node.val);
            inOrder(node.right);
        }
    }
}
