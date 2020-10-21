//在 N * N 的网格上，我们放置一些 1 * 1 * 1 的立方体。 
//
// 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。 
//
// 请你返回最终形体的表面积。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：[[2]]
//输出：10
// 
//
// 示例 2： 
//
// 输入：[[1,2],[3,4]]
//输出：34
// 
//
// 示例 3： 
//
// 输入：[[1,0],[0,2]]
//输出：16
// 
//
// 示例 4： 
//
// 输入：[[1,1,1],[1,0,1],[1,1,1]]
//输出：32
// 
//
// 示例 5： 
//
// 输入：[[2,2,2],[2,1,2],[2,2,2]]
//输出：46
// 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 50 
// 0 <= grid[i][j] <= 50 
// 
// Related Topics 几何 数学 
// 👍 129 👎 0


package leetcode.editor.cn;

/**
 * Java：三维形体的表面积
 * date：2020-10-21 13:47:19
 **/
public class P892SurfaceAreaOf3dShapes {
    public static void main(String[] args) {
        Solution solution = new P892SurfaceAreaOf3dShapes().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int surfaceArea(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            int res = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] != 0) {
                        res += grid[i][j] * 4 + 2;
                        if (i < row - 1) res -= Math.min(grid[i][j], grid[i + 1][j]);
                        if (i > 0) res -= Math.min(grid[i][j], grid[i - 1][j]);
                        if (j > 0) res -= Math.min(grid[i][j], grid[i][j - 1]);
                        if (j < col - 1) res -= Math.min(grid[i][j], grid[i][j + 1]);
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
