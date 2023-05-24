import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {
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

    List<Integer> list = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(list.get(i) - list.get(i - 1), min);
        }
        return min;
    }

    private void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            list.add(node.val);
            inOrder(node.right);
        }
    }
}
