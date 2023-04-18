import java.util.*;

public class BinaryTreeLevelOrderTraversal2 {
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        Stack<List<Integer>> tmp = new Stack<>();
        if (root == null) {
            return ans;
        }
        deque.add(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.removeFirst();
                list.add(node.val);
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
            }
            tmp.add(list);
        }
        while (!tmp.isEmpty()) {
            ans.add(tmp.pop());
        }
        return ans;
    }
}

