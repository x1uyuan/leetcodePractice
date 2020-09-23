//给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。 
//
// 说明：每次只能向下或者向右移动一步。 
//
// 示例: 
//
// 输入:
//[
//  [1,3,1],
//  [1,5,1],
//  [4,2,1]
//]
//输出: 7
//解释: 因为路径 1→3→1→1→1 的总和最小。
// 
// Related Topics 数组 动态规划 
// 👍 544 👎 0


package leetcode.editor.cn;

/**
 * Java：最小路径和
 * date：2020-07-23 09:40:22
 **/
public class P64MinimumPathSum {
    public static void main(String[] args) {
        Solution solution = new P64MinimumPathSum().new Solution();
        // TO TEST
        System.out.println(solution.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minPathSum(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            for (int i = 1; i < row; i++) {
                grid[i][0] += grid[i - 1][0];
            }
            for (int i = 1; i < col; i++) {
                grid[0][i] += grid[0][i - 1];
            }
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < col; j++) {
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                }
            }
            return grid[row - 1][col - 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
