import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int total = (right + 1) * (bottom + 1);
        while (total > 0) {
            for (int i = left; i <= right && total > 0; i++) {
                ans.add(matrix[top][i]);
                total--;
            }
            top++;
            for (int i = top; i <= bottom && total > 0; i++) {
                ans.add(matrix[i][right]);
                total--;
            }
            right--;
            for (int i = right; i >= left && total > 0; i--) {
                ans.add(matrix[bottom][i]);
                total--;
            }
            bottom--;
            for (int i = bottom; i >= top && total > 0; i--) {
                ans.add(matrix[i][left]);
                total--;
            }
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        spiralMatrix.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
    }
}
