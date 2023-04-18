import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumDepthOfBinaryTree {

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

    public int minDepth(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        int depth = 0;
        if (root == null) {
            return depth;
        }
        deque.add(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.removeFirst();
                if (node.left == null && node.right == null) {
                    return depth + 1;
                }
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
