import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreePaths {
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

    List<String> ans = new ArrayList<>();
    Deque<String> deque = new ArrayDeque<>();

    public List<String> binaryTreePaths(TreeNode root) {
        preOrder(root);
        return ans;
    }

    private void preOrder(TreeNode node) {
        if (node != null) {
            deque.add(String.valueOf(node.val));
            if (node.left == null && node.right == null) {
                StringBuilder sb = new StringBuilder();
                Deque<String> tmp = new ArrayDeque<>(deque);
                while (!tmp.isEmpty()) {
                    sb.append(tmp.removeFirst());
                    if (tmp.size() != 0) {
                        sb.append("->");
                    }
                }
                ans.add(String.valueOf(sb));
            }
            preOrder(node.left);
            preOrder(node.right);
            deque.removeLast();
        }
    }

}
