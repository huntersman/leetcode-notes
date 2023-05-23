import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
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

    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return findTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode findTree(int[] preorder, int preBegin, int preEnd, int[] inorder, int inBegin, int inEnd) {
        if (preBegin >= preEnd || inBegin >= inEnd) {
            return null;
        }
        int rootIndex = map.get(preorder[preBegin]);
        TreeNode node = new TreeNode(inorder[rootIndex]);
        int lenOfLeft = rootIndex - inBegin;
        node.left = findTree(preorder, preBegin + 1, preBegin + lenOfLeft + 1, inorder, inBegin, rootIndex);
        node.right = findTree(preorder, preBegin + lenOfLeft + 1, preEnd, inorder, rootIndex + 1, inEnd);
        return node;
    }
}
