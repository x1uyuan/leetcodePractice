//给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。 
//
// 每次「迁移」操作将会引发下述活动： 
//
// 
// 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。 
// 位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。 
// 位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。 
// 
//
// 请你返回 k 次迁移操作后最终得到的 二维网格。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
//输出：[[9,1,2],[3,4,5],[6,7,8]]
// 
//
// 示例 2： 
//
// 
//
// 输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
//输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
// 
//
// 示例 3： 
//
// 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
//输出：[[1,2,3],[4,5,6],[7,8,9]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= grid.length <= 50 
// 1 <= grid[i].length <= 50 
// -1000 <= grid[i][j] <= 1000 
// 0 <= k <= 100 
// 
// Related Topics 数组 
// 👍 33 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * Java：二维网格迁移
 * date：2020-10-12 14:01:35
 **/
public class P1260Shift2dGrid {
    public static void main(String[] args) {
        Solution solution = new P1260Shift2dGrid().new Solution();
        // TO TEST
//        List<List<Integer>> out = solution.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1);
//        List<List<Integer>> out = solution.shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4);
        List<List<Integer>> out = solution.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9);
        for (List<Integer> lst : out) {
            for (int i : lst) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int row = grid.length;
            int col = grid[0].length;
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                List<Integer> lst = new ArrayList<>();
                res.add(lst);
            }
            int rRow = 0;
            int rCol = 0;
            int cRow = (row * col - k % (row * col)) / col;
            if (cRow == row) cRow = 0;
            int cCol = (row * col - k % (row * col)) % col;
            int count = 0;

            while (count != row * col) {
                res.get(rRow).add(grid[cRow][cCol]);
                rRow = rRow + (rCol + 1) / col;
                rCol = (rCol + 1) % col;
                if (cRow == row - 1 && cCol == col - 1) {
                    cRow = 0;
                    cCol = 0;
                } else if (cCol == col - 1) {
                    cRow++;
                    cCol = 0;
                } else {
                    cCol++;
                }
                count++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
