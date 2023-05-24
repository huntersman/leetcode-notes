import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeInBinarySearchTree {

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

    Map<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
        inOrder(root);
        List<Map.Entry<Integer, Integer>> mapList = map.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .toList();
        list.add(mapList.get(0).getKey());
        for (int i = 1; i < mapList.size(); i++) {
            if (mapList.get(i).getValue() == mapList.get(i - 1).getValue()) {
                list.add(mapList.get(i).getKey());
            } else {
                break;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            inOrder(node.right);
        }
    }
}
