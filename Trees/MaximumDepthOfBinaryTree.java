import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTree {
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

    public int maxDepth(TreeNode root) {
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
