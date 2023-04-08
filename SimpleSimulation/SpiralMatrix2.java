public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int cnt = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (cnt <= n * n) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = cnt++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = cnt++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                ans[bottom][i] = cnt++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                ans[i][left] = cnt++;
            }
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        SpiralMatrix2 spiralMatrix2 = new SpiralMatrix2();
        spiralMatrix2.generateMatrix(3);
    }
}
